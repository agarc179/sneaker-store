package com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces;

public interface ICustomer {
    boolean equals(Object object);

    Long getRaffleId();

    Long getSneakerId();

    String getName();

    String getEmail();

    String getPhoneNumber();

    void setRaffleId(Long raffleId);

    void setSneakerId(Long sneakerId);

    void setName(String name);

    void setEmail(String email);

    void setPhoneNumber(String phoneNumber);

    String toString();

}
