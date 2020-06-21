package xws.team16.carservice.dto;

import lombok.*;
import org.joda.time.DateTime;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class CarInfoDTO {
    private Long id;
    private ModelDTO model;
    private MarkDTO mark;
    private FuelDTO fuel;
    private CarClassDTO carClass;
    private GearboxDTO gearbox;
    private int kilometrage;
    private int numberOfChildSeats;
    private boolean hasAndroid;
    private float overallGrade;
}
