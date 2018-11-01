package com.sneaker.sneakerstore.sneaker;

import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Sneaker;
import com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces.IStore;
import com.sneaker.sneakerstore.sneaker.sneakerShop.services.SneakerService;
import com.sneaker.sneakerstore.sneaker.sneakerShop.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

import java.util.List;


@SpringBootApplication(exclude = {MongoAutoConfiguration.class, MongoDataAutoConfiguration.class})
//@EnableJpaAuditing
//@ComponentScan("com.sneaker.sneakerstore.sneaker.sneakerShop.spring")
//@EnableJpaRepositories("com.sneaker.sneakerstore.sneaker.sneakerShop.spring")
//@EnableScan("edu.depaul.cdm.se.sampleproject.book.jpa")
public class ProjectApplication implements CommandLineRunner {

    @Autowired
    private SneakerService sneakerService;

	public static void main(String[] args) {
		ProjectApplication mainMongoDB = new ProjectApplication();

		System.out.println("__Example___");
		SpringApplication.run(ProjectApplication.class, args);

        System.out.println("__MongoDB STARTS__");
		mainMongoDB.showStore("60603");

        System.out.println("");

	}

    @Override
    public void run(String... args) throws Exception {

        System.out.println("__PostgresSQL STARTS___");
        List<Sneaker> sneakerList = sneakerService.getAllSneakers();
        for(Sneaker sneaker : sneakerList){
            System.out.println("Name: " + sneaker.getName());
        }
    }

	//MongoDB
	private void showStore(String zip){
		StoreService service = new StoreService();
		List<IStore> stores = service.getStore(zip);

		System.out.println("");
		System.out.println("---Store collection based on zipCode: " + zip);
		for(IStore store: stores){
			System.out.println(store.getName() + ", " + store.getZip());
		}
	}


}
