package com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces;

public interface IShoppingCart {

    boolean equals(Object object);

    Long getId();

    Long getSneakerId();

    int getQuantity();

    void setId(Long id);

    void setSneakerId(Long sneakerId);

    void setQuantity(int quantity);

    String toString();

}
