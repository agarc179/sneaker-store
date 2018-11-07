package com.sneaker.sneakerstore.sneaker.sneakerShop.services;


import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Sneaker;
import com.sneaker.sneakerstore.sneaker.sneakerShop.repositories.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

// PostgresSQL Sneaker Service

@Service
public class SneakerService {

    @Autowired
    SneakerRepository repository;

    @Autowired
    public void setSneakerRepository(SneakerRepository sp){
        this.repository = sp;
    }

    // create a new entry in sneaker table for testing purposes
    public void createSneaker() {
        System.out.println(repository.count());
        Sneaker sneaker = new Sneaker();
        //sneaker.setId(new Long(209446));
        sneaker.setName("Yeezy Wave Runner boost 700");
        sneaker.setBrand("Adidas");
        sneaker.setColor("Light Gray");
        sneaker.setSize("8.5");
        sneaker.setType("Street");
        sneaker.setPrice("300");
        sneaker.setGender("male");

        repository.save(sneaker);

        System.out.println(repository.count());
    }

    public Sneaker saveSneaker(Sneaker sneaker){
        Sneaker s = new Sneaker();

        s.setId(sneaker.getId());
        s.setBrand(sneaker.getBrand());
        s.setName(sneaker.getName());
        s.setColor(sneaker.getColor());
        s.setPrice(sneaker.getPrice());
        s.setSize(sneaker.getSize());
        s.setType(sneaker.getType());
        s.setGender(sneaker.getGender());

        return s;

    }

    public Sneaker getSneaker(Long sneakerId){


        //will get the sneaker by a sneakerId
        Sneaker sneaker = saveSneaker(repository.getOne(sneakerId));

        return sneaker;
    }

    // querys all the sneaker inside the sneaker table
    public List<Sneaker> getAllSneakers(){
        System.out.println(repository.count());
        return repository.findAll();
    }

}
