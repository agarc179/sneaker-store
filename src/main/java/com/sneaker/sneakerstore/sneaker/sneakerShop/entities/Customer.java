package com.sneaker.sneakerstore.sneaker.sneakerShop.entities;

import com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces.ICustomer;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Customer implements Serializable, ICustomer {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long raffleId;

    @Column
    private Long sneakerId;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String phoneNumber;

    public Customer(){

    }

    @Override
    public Long getRaffleId() {
        return raffleId;
    }

    @Override
    public void setRaffleId(Long raffleId) {
        this.raffleId = raffleId;
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
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



}
