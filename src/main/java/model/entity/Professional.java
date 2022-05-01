package model.entity;

import lombok.*;
import model.entity.base.User;

import javax.persistence.*;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
@DiscriminatorValue("Professional")
public class Professional extends User {
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private byte[] image;

    @JoinTable(name = "professional_service",
            joinColumns = {@JoinColumn(name = "professional_id")},
            inverseJoinColumns = {@JoinColumn(name = "service_id")})
    @ManyToMany
    @ToString.Exclude
    private Set<Service> services;
}
