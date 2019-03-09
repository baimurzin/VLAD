package ru.learn.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "shop_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    @OneToOne(mappedBy = "user")
    public Basket basket;
}