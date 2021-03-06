package xws.team16.requestservice.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Getter @Setter
@Entity
@Table(name = "AD")
public class Ad {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

//   private boolean cdwAvailable;
//   private String pickUpPlace;
//   private double allowedKilometrage;

//   private LocalDate fromDate;
//   private LocalDate toDate;

   @OneToMany(mappedBy = "ad")
   private Set<RentRequest> request;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "user_id", nullable = false)
   private User user;

//   private Car car;
//   private PriceList priceList;

}