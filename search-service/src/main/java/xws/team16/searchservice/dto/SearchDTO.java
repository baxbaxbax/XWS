package xws.team16.searchservice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.joda.time.DateTime;


@Getter @Setter
@NoArgsConstructor
public class SearchDTO {
    private String pickUpPlace;
    private DateTime fromDate;
    private DateTime toDate;
    private MarkDTO mark;
    private ModelDTO model;
    private FuelDTO fuel;
    private GearboxDTO gearbox;
    private CarClassDTO carClass;
    private double priceFrom;
    private double priceTo;
    private double kilometrageFrom;
    private double kilometrageTo;
    private double kilometrageDrive;
    private Boolean cdw;
    private int numberOfChildSeats;
}
