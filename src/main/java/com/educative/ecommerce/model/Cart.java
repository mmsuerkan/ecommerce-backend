package com.educative.ecommerce.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "cart")
@NoArgsConstructor
@Getter
@Setter
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "created_date")
    private Date createdDate;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "user_id")
    private User user;

    private int quantity;

    public Cart(Date createdDate, Product product, User user, int quantity) {
        this.createdDate = createdDate;
        this.product = product;
        this.user = user;
        this.quantity = quantity;
    }

    public Cart(Product product, int quantity, User user) {
        this.product = product;
        this.user = user;
        this.quantity = quantity;
    }
}
