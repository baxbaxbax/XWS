package xws.tim16.rentacar.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@Entity
public class Occupied {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   @Column(name = "date_from", nullable = false)
   @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate", parameters = {
           @org.hibernate.annotations.Parameter(name = "databaseZone", value = "UTC"),
           @org.hibernate.annotations.Parameter(name = "javaZone", value = "UTC")
   })
   private LocalDate dateFrom;


   @Column(name = "date_to", nullable = false)
   @Type(type = "org.jadira.usertype.dateandtime.joda.PersistentLocalDate", parameters = {
           @org.hibernate.annotations.Parameter(name = "databaseZone", value = "UTC"),
           @org.hibernate.annotations.Parameter(name = "javaZone", value = "UTC")
   })
   private LocalDate dateTo;

   @ManyToOne(fetch = FetchType.LAZY)
   @JoinColumn(name = "car_id", nullable = false)
   private Car car;

   private Long refId;

}