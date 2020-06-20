package xws.team16.carservice.service;

import xws.team16.carservice.generated.ad.AdDTOType;
import xws.team16.carservice.generated.ad.PostAdRequest;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import xws.team16.carservice.dto.AdDTO;
import xws.team16.carservice.model.Ad;
import xws.team16.carservice.model.Car;
import xws.team16.carservice.model.PriceList;
import xws.team16.carservice.model.User;
import xws.team16.carservice.repository.AdRepository;

import java.sql.SQLException;

@Service @Slf4j
public class AdService {

    private AdRepository adRepository;
    private CarService carService;
    private PriceListService priceListService;

    @Autowired
    public AdService(AdRepository adRepository, CarService carService, PriceListService priceListService) {
        this.adRepository = adRepository;
        this.carService = carService;
        this.priceListService = priceListService;
    }

    public ResponseEntity<Void> newAd(AdDTO adDTO) throws SQLException {
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

    public boolean newAd(PostAdRequest adRequest) {
        log.info("Ad service - add new ad and car");
        AdDTOType adType = adRequest.getAdRequest();
        Car car = this.carService.newCar(adType.getCarDTO());
        PriceList priceList = this.priceListService.getPriceListById(adType.getPriceListId());
        User user = car.getOwner();

        Ad ad = new Ad();
        ad.setCar(car);
        ad.setAllowedKilometrage(adType.getAllowedKilometrage());
        ad.setCdwAvailable(adType.isCdwAvailable());
        ad.setPickUpPlace(adType.getPickUpPlace());
        ad.setFromDate(new DateTime(adType.getFromDate()));
        ad.setToDate(new DateTime(adType.getToDate()));
        ad.setUser(user);
        ad.setPriceList(priceList);

        ad = this.adRepository.save(ad);
        log.info("Ad created with id " + ad.getId());
        return true;
    }
}
