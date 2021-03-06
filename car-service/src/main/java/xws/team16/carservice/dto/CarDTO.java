package xws.team16.carservice.dto;

import lombok.*;

import java.util.List;

@Getter @Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
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
