package model.entity;

import lombok.*;
import model.entity.base.BaseEntity;
import model.enumeration.OrderStatus;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
public class Order extends BaseEntity<Integer> {
    private Long orderProposedPrice;
    private String description;
    private Date registrationDate;
    private Date preferredDueDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    private String city;
    private String street;
    private String alley;
    private String buildingNo;
}
