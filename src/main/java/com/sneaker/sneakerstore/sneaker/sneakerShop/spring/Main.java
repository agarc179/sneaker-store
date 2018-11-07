//package com.sneaker.sneakerstore.sneaker.sneakerShop.spring;
//
//import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Sneaker;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
//
//import java.util.List;
//
//@SpringBootApplication
//@EnableJpaAuditing
//@ComponentScan("com.sneaker.sneakerstore.sneaker.sneakerShop.spring")
//public class Main implements CommandLineRunner {
//
//    @Autowired
//    SneakerRepository repository;
//
//
//    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(Main.class);
//        app.run(args);
//
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        //createSneaker();
//
//        List<Sneaker> sneakerList = getAllSneakers();
//        for(Sneaker sneaker : sneakerList){
//            System.out.println("Name: " + sneaker.getName());
//        }
//
//    }
//
//    // create a new entry in sneaker table
//    private void createSneaker() {
//        System.out.println(repository.count());
//        Sneaker sneaker = new Sneaker();
//        //sneaker.setId(new Long(209446));
//        sneaker.setName("Travis Scott Air Jordan IV");
//        sneaker.setBrand("Jordan");
//        sneaker.setColor("Light Blue");
//        sneaker.setSize("10");
//        sneaker.setType("Street");
//        sneaker.setPrice("225");
//        sneaker.setGender("male");
//
//        repository.save(sneaker);
//
//        System.out.println(repository.count());
//    }
//
//    // querys all the sneaker inside the sneaker table
//    private List<Sneaker> getAllSneakers(){
//        System.out.println(repository.count());
//        return repository.findAll();
//    }
//}
