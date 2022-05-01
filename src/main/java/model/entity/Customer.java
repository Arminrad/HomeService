package model.entity;

import lombok.*;
import model.entity.base.BaseEntity;
import model.entity.base.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
@DiscriminatorValue("customer")
public class Customer extends User {

}
