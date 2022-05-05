package entities;

import lombok.*;
import entities.base.BaseEntity;
import entities.enumeration.OrderStatus;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name = "orders")
public class Order extends BaseEntity<Integer> {
    private Long proposedOrderPrice;
    private String description;
    private Date orderRegistrationDate;
    private Date preferredDueDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private String city;
    private String street;
    private String alley;
    private String buildingNo;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Service service;

    @OneToMany(mappedBy = "order")
    @ToString.Exclude
    private Set<Offer> offers;
}
