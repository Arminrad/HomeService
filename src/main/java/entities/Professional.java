package entities;

import entities.enumeration.UserStatus;
import entities.enumeration.UserType;
import lombok.*;
import entities.base.User;

import javax.persistence.*;
import java.util.Date;
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
    private String nationalCode;

    @JoinTable(name = "professional_service",
            joinColumns = {@JoinColumn(name = "professional_id")},
            inverseJoinColumns = {@JoinColumn(name = "service_id")})
    @ManyToMany
    @ToString.Exclude
    private Set<Service> services = new HashSet<>();

    @OneToMany(mappedBy = "professional")
    @ToString.Exclude
    private Set<Comment> comments;

    @OneToMany(mappedBy = "professional")
    @ToString.Exclude
    private Set<Offer> offers;


    public Professional(String firstName, String lastName, String email,
                        String password, Date signUpDate, Double balance,
                        UserStatus status, UserType type, String city,
                        byte[] image, String nationalCode, Set<Service> services) {
        super(firstName, lastName, email, password, signUpDate, balance, status, type);
        this.city = city;
        this.image = image;
        this.nationalCode = nationalCode;
        this.services = services;
    }

    public Professional(String city, byte[] image, String nationalCode, Set<Service> services) {
        this.city = city;
        this.image = image;
        this.nationalCode = nationalCode;
        this.services = services;
    }
}
