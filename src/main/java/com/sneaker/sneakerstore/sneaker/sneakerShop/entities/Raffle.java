//package com.sneaker.sneakerstore.sneaker.sneakerShop.entities;
//
//import com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces.IRaffle;
//
//import javax.persistence.Column;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import java.io.Serializable;
//
//public class Raffle implements Serializable, IRaffle {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long raffleId;
//
//    @Column
//    private Long sneakerId;
//
//    @Column
//    private String date;
//
//    public Raffle(){
//
//    }
//
//    @Override
//    public Long getRaffleId() {
//        return raffleId;
//    }
//
//    @Override
//    public void setRaffleId(Long raffleId) {
//        this.raffleId = raffleId;
//    }
//
//    @Override
//    public Long getSneakerId() {
//        return sneakerId;
//    }
//
//    @Override
//    public void setSneakerId(Long sneakerId) {
//        this.sneakerId = sneakerId;
//    }
//
//    @Override
//    public String getDate() {
//        return date;
//    }
//
//    @Override
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//
//}
