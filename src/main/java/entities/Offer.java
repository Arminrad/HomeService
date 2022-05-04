package entities;

import lombok.*;
import entities.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.sql.Time;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
public class Offer extends BaseEntity<Integer> {
    private Date offerRegistrationDate;
    private Long proposedOfferPrice;
    private Time serviceDuration;
    private Time startTime;
    @ManyToOne
    private Order order;
    @ManyToOne
    private Professional professional;

}
