//package com.sneaker.sneakerstore.sneaker.sneakerShop.jpa;
//
//import com.sneaker.sneakerstore.sneaker.ISneaker;
//import org.springframework.context.annotation.Scope;
//
//import java.io.Serializable;
//import javax.persistence.*;
//
//@Entity
//@Scope("prototype")
////@NamedQuery(name = "findAllSneakers", query = "select b from Sneaker b")
//public class Sneaker implements Serializable, ISneaker {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private String id;
//
//    @Column
//    private String name;
//
//    @Column
//    private String brand;
//
//    @Column
//    private String color;
//
//    @Column
//    private String size;
//
//    @Column
//    private String type;
//
//    @Column
//    private String price;
//
//    @Column
//    private String gender;
//
//    public Sneaker() {
//
//    }
//
//
//    @Override
//    public String getId() {
//        return id;
//    }
//
//    @Override
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    @Override
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String getBrand() {
//        return brand;
//    }
//
//    @Override
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//
//    @Override
//    public String getColor() {
//        return color;
//    }
//
//    @Override
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    @Override
//    public String getSize() {
//        return size;
//    }
//
//    @Override
//    public void setSize(String size) {
//        this.size = size;
//    }
//
//    @Override
//    public String getType() {
//        return type;
//    }
//
//    @Override
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    @Override
//    public String getPrice() {
//        return price;
//    }
//
//    @Override
//    public void setPrice(String price) {
//        this.price = price;
//    }
//
//    @Override
//    public String getGender() {
//        return gender;
//    }
//
//    @Override
//    public void setGender(String gender) {
//        this.gender = gender;
//    }
//
//
//}
