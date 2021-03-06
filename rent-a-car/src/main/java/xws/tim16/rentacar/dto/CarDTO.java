package xws.tim16.rentacar.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class CarDTO {
    private Long id;
    private Long modelId;
    private Long markId;
    private Long fuelId;
    private Long carClassId;
    private Long gearboxId;
    private Long userId;
    private double kilometrage;
    private int numberOfChildSeats;
    private boolean hasAndroid;
    private List<String> images;
}
