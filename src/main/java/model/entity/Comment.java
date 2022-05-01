package model.entity;

import model.entity.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.ManyToOne;

public class Comment extends BaseEntity<Integer> {
    private String text;
    private Integer rating;
    @ManyToOne
    private Customer customer;
    @ManyToOne
    private Professional professional;
}
