package entities;

import lombok.*;
import entities.base.BaseEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
public class Service extends BaseEntity<Integer> {

    private String serviceName;

    @OneToOne
    private Service parent;

    private Long lowestPrice;

    @ManyToMany(mappedBy = "services")
    @ToString.Exclude
    private Set<Professional> professionals = new HashSet<>();

    @OneToMany(mappedBy = "service")
    @ToString.Exclude
    private Set<Order> orders;
}
