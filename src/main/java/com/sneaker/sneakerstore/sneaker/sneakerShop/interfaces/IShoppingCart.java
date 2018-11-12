package com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces;

public interface IShoppingCart {

    boolean equals(Object object);

    Long getId();

    Long getSneakerId();

    Integer getQuantity();

    void setId(Long id);

    void setSneakerId(Long sneakerId);

    void setQuantity(Integer quantity);

    String toString();

}
