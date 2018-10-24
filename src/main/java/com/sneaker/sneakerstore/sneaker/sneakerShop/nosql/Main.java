package com.sneaker.sneakerstore.sneaker.sneakerShop.nosql;

import com.sneaker.sneakerstore.sneaker.ISneaker;
import com.sneaker.sneakerstore.sneaker.sneakerShop.jdbc.Sneaker;

import java.util.List;
import java.util.Random;


public class Main {

    public static void main(String[] args){
        Main main = new Main();
        //main.createNewSneaker();
        main.showEntities();

    }

    private void createNewSneaker(){
        Random rnd = new Random();
        int idInt = 100000 + rnd.nextInt(900000);

        SneakerService services = new SneakerService();
        Sneaker sneaker = new Sneaker();
        sneaker.setName("Travis Scott Air Jordan IV");
        sneaker.setId(sneaker.getName().substring(0, 3) + idInt);
        sneaker.setBrand("Jordan");
        sneaker.setColor("Light Blue");
        sneaker.setSize("8.5");
        sneaker.setType("Street");
        sneaker.setPrice("225");
        sneaker.setGender("male");
        services.saveSneaker(sneaker);
    }

    private void showEntities(){
        SneakerService service = new SneakerService();
        List<ISneaker> sneakers = service.getAllSneakers();

        System.out.println("");
        System.out.println("---Sneaker Collection---");
        for(ISneaker sneaker: sneakers){
            System.out.println(sneaker.getId() + ", " + sneaker.getName() + ", " + sneaker.getBrand() + ", " + sneaker.getColor());
        }

    }
}
