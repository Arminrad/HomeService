package model.entity;

import lombok.*;
import model.entity.base.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
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

    @ManyToMany(mappedBy = "services")
    @ToString.Exclude
    private Set<Professional> professionals = new HashSet<>();
}
