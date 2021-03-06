package xws.team16.carservice.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import xws.team16.carservice.dto.GradeDTO;
import xws.team16.carservice.generated.car.GetGradeResponse;
import xws.team16.carservice.generated.car.TGrade;
import xws.team16.carservice.model.Ad;
import xws.team16.carservice.model.Car;
import xws.team16.carservice.model.Grade;
import xws.team16.carservice.model.User;
import xws.team16.carservice.repository.GradeRepository;

import java.util.ArrayList;
import java.util.List;

@Service @Slf4j
public class GradeService {
    private GradeRepository gradeRepository;
    private UserService userService;
    private CarService carService;
    private AdService adService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    public GradeService(GradeRepository gradeRepository, UserService userService, CarService carService, AdService adService) {
        this.gradeRepository = gradeRepository;
        this.userService = userService;
        this.carService = carService;
        this.adService = adService;
    }

    public ResponseEntity<?> createGrade(GradeDTO gradeDTO) {
        log.info("Grade service - creating grade for car with id " + gradeDTO.getCarId());
        Grade grade  = Grade.builder()
                .grade(gradeDTO.getGrade())
                .build();
        User user = this.userService.getUserByUsername(gradeDTO.getUserUsername());
        Ad ad  = this.adService.getAd(gradeDTO.getAdId());
        Car car = ad.getCar();
        car.setNumberOfGrades(car.getNumberOfGrades()+1);
        int sum = 0;
        for(Grade g: car.getGrades()){
            sum = sum + g.getGrade();
        }
        car.setOverallGrade(sum/car.getNumberOfGrades());
        grade.setCar(car);
        grade.setAd(ad);
        grade.setUser(user);

        Grade gradeCheck = this.gradeRepository.findByUserIdAndAdId(user.getId(),ad.getId());

        if(gradeCheck != null){
            log.info("Grade service - grade already added");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        log.info("Grade service - saving grade");
        this.carService.saveCar(car);
        this.gradeRepository.save(grade);
        log.info("Grade service - grade saved");
        return  new ResponseEntity<>(HttpStatus.CREATED);

    }

    public ResponseEntity<?> getGrades(Long carId) {
        log.info("Grade service - getting grades");
        List<Grade> grades = this.gradeRepository.findByCarId(carId);
        List<GradeDTO> gradeDTOS = new ArrayList<>();

        log.info("Grade service - creating grades dto");
        for (Grade grade: grades){
            GradeDTO gradeDTO = GradeDTO.builder()
                    .id(grade.getId())
                    .grade(grade.getGrade())
                    .carId(grade.getCar().getId())
                    .userUsername(grade.getUser().getUsername())
                    .adId(grade.getAd().getId())
                    .build();
            gradeDTOS.add(gradeDTO);
        }
        log.info("Grade service - returning grades");
        return new ResponseEntity<>(gradeDTOS, HttpStatus.OK);
    }

    public ResponseEntity<?> check(String username, Long id) {
        log.info("Comment service - checking comment already created");
        User user = this.userService.getUserByUsername(username);
        Grade gradeCheck = this.gradeRepository.findByUserIdAndAdId(user.getId(), id);

        if (gradeCheck != null) {
            return new ResponseEntity<>(true, HttpStatus.OK);
        }
        return new ResponseEntity<>(false, HttpStatus.OK);
    }

    public GetGradeResponse getGradesSoap(long gradeRequest) {
        log.info("Grade service - getting soap grades");
        Ad ad = adService.getAdById(gradeRequest);
        Car car = ad.getCar();
        List<Grade> grades = this.gradeRepository.findByCarId(car.getId());
        List<GradeDTO> gradeDTOS = new ArrayList<>();

        log.info("Grade service - creating grades xml");
        for (Grade grade: grades){
            GradeDTO gradeDTO = GradeDTO.builder()
                    .id(grade.getId())
                    .grade(grade.getGrade())
                    .carId(grade.getCar().getId())
                    .userUsername(grade.getUser().getUsername())
                    .adId(grade.getAd().getId())
                    .build();
            gradeDTOS.add(gradeDTO);
        }

        log.info("Grade service - retrieving grades to soap");
        GetGradeResponse response = new GetGradeResponse();
        for(GradeDTO g: gradeDTOS){
            TGrade tGrade = new TGrade();
            tGrade.setGrade(g.getGrade());
            tGrade.setId(g.getId());
            tGrade.setUserUsername(g.getUserUsername());
            tGrade.setAdId(g.getAdId());
            response.getGrades().add(tGrade);
        }
        log.info("Grade service - comment retrived");
        return response;
    }
}
