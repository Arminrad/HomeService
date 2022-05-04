package entities;

import lombok.*;
import entities.base.User;

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
@DiscriminatorValue("Professional")
public class Professional extends User {
    @Column(nullable = false)
    private String city;
    @Column(nullable = false)
    private byte[] image;
    private Long lowestPrice;

    @JoinTable(name = "professional_service",
            joinColumns = {@JoinColumn(name = "professional_id")},
            inverseJoinColumns = {@JoinColumn(name = "service_id")})
    @ManyToMany
    @ToString.Exclude
    private Set<Service> services = new HashSet<>();

    @OneToMany(mappedBy = "professional", fetch = FetchType.EAGER)
    @ToString.Exclude
    private Set<Comment> comments;

    @OneToMany(mappedBy = "professional", fetch = FetchType.EAGER)
    @ToString.Exclude
    private Set<Offer> offers;
}