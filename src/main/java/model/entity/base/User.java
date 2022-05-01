package model.entity.base;

import lombok.*;
import model.enumeration.UserStatus;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "user-type", discriminatorType = DiscriminatorType.STRING)
@Table(name = "users")
public class User extends BaseEntity<Integer> {

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    @Column(nullable = false)
    private String password;
    private Date date;
    private Double balance;
    private UserStatus status;

    @Transient
    public String getDiscriminatorValue() {
        DiscriminatorValue val =this.getClass().getAnnotation(DiscriminatorValue.class);
        return val == null ? null: val.value();
    }
}
