package entities;

import lombok.*;
import entities.base.User;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
@DiscriminatorValue("customer")
public class Customer extends User {

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    @ToString.Exclude
    private Set<Comment> comments;

    @OneToMany(mappedBy = "customer", fetch = FetchType.EAGER)
    @ToString.Exclude
    private Set<Order> orders;

}