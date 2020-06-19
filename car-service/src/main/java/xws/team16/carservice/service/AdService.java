package xws.team16.carservice.service;

import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import xws.team16.carservice.dto.AdDTO;
import xws.team16.carservice.dto.AdInfoDTO;
import xws.team16.carservice.dto.CarDTO;
import xws.team16.carservice.dto.CarInfoDTO;
import xws.team16.carservice.model.Ad;
import xws.team16.carservice.model.Car;
import xws.team16.carservice.model.PriceList;
import xws.team16.carservice.model.User;
import xws.team16.carservice.repository.AdRepository;

@Service @Slf4j
public class AdService {

    private AdRepository adRepository;
    private CarService carService;
    private PriceListService priceListService;
    private ModelMapper modelMapper;

    @Autowired
    public AdService(ModelMapper modelMapper, AdRepository adRepository, CarService carService, PriceListService priceListService) {
        this.adRepository = adRepository;
        this.carService = carService;
        this.priceListService = priceListService;
        this.modelMapper = modelMapper;
    }

    public ResponseEntity<Void> newAd(AdDTO adDTO) {
        log.info("Ad service - add new ad and car");
        Car car = this.carService.newCar(adDTO.getCarDTO());
        PriceList priceList = this.priceListService.getPriceListById(adDTO.getPriceListId());
        User user = car.getOwner();

        Ad ad = new Ad();
        ad.setCar(car);
        ad.setAllowedKilometrage(adDTO.getAllowedKilometrage());
        ad.setCdwAvailable(adDTO.isCdwAvailable());
        ad.setPickUpPlace(adDTO.getPickUpPlace());
        ad.setFromDate(adDTO.getFromDate());
        ad.setToDate(adDTO.getToDate());
        ad.setUser(user);
        ad.setPriceList(priceList);

        ad = this.adRepository.save(ad);
        log.info("Ad created with id " + ad.getId());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    public Ad getAd(Long id) {
        Ad ad = this.adRepository.findById(id).orElseGet(null);
        return  ad;
    }

    public ResponseEntity<?> getOneAdById(Long id) {
        Ad ad = this.adRepository.getOne(id);
        AdInfoDTO adDTO = new AdInfoDTO();
        adDTO.setAllowedKilometrage(ad.getAllowedKilometrage());
        adDTO.setCdwAvailable(ad.isCdwAvailable());
        adDTO.setFromDate(ad.getFromDate());
        adDTO.setToDate(ad.getToDate());
        adDTO.setId(ad.getId());
        adDTO.setPickUpPlace(ad.getPickUpPlace());
        adDTO.setPriceListId(ad.getPriceList().getId());
        CarInfoDTO car = modelMapper.map(ad.getCar(), CarInfoDTO.class);
        float grade  = 0;
        if(ad.getCar().getNumberOfGrades()!=0){
             grade = ad.getCar().getGrades().size() / ad.getCar().getNumberOfGrades();
        }
        car.setOverallGrade(grade);
        adDTO.setCar(car);

        return new ResponseEntity<>(adDTO,HttpStatus.OK);
    }
}
