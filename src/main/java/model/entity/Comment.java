package model.entity;

import lombok.*;
import model.entity.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
public class Comment extends BaseEntity<Integer> {
    private String text;
    private Integer rating;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Professional professional;
}
