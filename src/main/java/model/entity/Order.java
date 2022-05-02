package model.entity;

import lombok.*;
import model.entity.base.BaseEntity;
import model.enumeration.OrderStatus;

import javax.persistence.*;
import java.util.Date;

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
}
