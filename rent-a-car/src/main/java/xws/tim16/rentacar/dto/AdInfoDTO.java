package xws.tim16.rentacar.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.joda.time.DateTime;
import xws.tim16.rentacar.util.JsonJodaDateTimeSerializer;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class AdInfoDTO {
    private Long id;
    private boolean cdwAvailable;
    private String pickUpPlace;
    @JsonSerialize(using = JsonJodaDateTimeSerializer.class)
    private DateTime fromDate;
    @JsonSerialize(using = JsonJodaDateTimeSerializer.class)
    private DateTime toDate;
    private double allowedKilometrage;
    private CarInfoDTO car;
    private Long priceListId;
    private boolean hasAndroid;
    private PriceListDTO priceList;
    private Integer pages;
    private Long userId;
    private List<String> images;

}
