package com.sneaker.sneakerstore.sneaker.sneakerShop.entities;

// SQL Entity

import com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces.IShoppingCart;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class ShoppingCart implements Serializable, IShoppingCart {

    private  static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private Long sneakerId;

    @Column
    private int quantity;

    public ShoppingCart(){

    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Long getSneakerId() {
        return sneakerId;
    }

    @Override
    public void setSneakerId(Long sneakerId) {
        this.sneakerId = sneakerId;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
