package model.entity;

import javax.persistence.ManyToOne;
import java.sql.Time;
import java.util.Date;

public class Offer {
    private Date offerRegistrationDate;
    private Long proposedOfferPrice;
    private Time serviceDuration;
    private Time startTime;
    @ManyToOne
    private Order order;
    @ManyToOne
    private Professional professional;

}
