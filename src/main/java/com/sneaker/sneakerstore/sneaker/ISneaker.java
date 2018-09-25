package com.sneaker.sneakerstore.sneaker;

public interface ISneaker {

    boolean equals(Object object);

    String getId();

    String getName();

    String getBrand();

    String getColor();

    String getSize();

    String getType();

    String getPrice();

    String getGender();

    void setId(String id);

    void setName(String name);

    void setBrand(String brand);

    void setColor(String color);

    void setSize(String size);

    void setType(String type);

    void setPrice(String price);

    void setGender(String gender);

    String toString();
}
