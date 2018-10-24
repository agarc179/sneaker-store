package com.sneaker.sneakerstore.sneaker.sneakerShop.spring;

import com.sneaker.sneakerstore.sneaker.sneakerShop.jpa.Sneaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@ComponentScan("com.sneaker.sneakerstore.sneaker")
public class Main implements CommandLineRunner {

    @Autowired
    SneakerRepository repository;

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(Main.class);
        app.run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        createExample();

    }

    private void createExample() {
        System.out.println(repository.count());
        Sneaker sneaker = new Sneaker();
        sneaker.setId("Air209445");
        sneaker.setName("Air Force One");
        sneaker.setBrand("Nike");
        sneaker.setColor("White");
        sneaker.setSize("11");
        sneaker.setType("Casual");
        sneaker.setPrice("90");
        sneaker.setGender("male");

        repository.save(sneaker);

        System.out.println(repository.count());
    }
}
