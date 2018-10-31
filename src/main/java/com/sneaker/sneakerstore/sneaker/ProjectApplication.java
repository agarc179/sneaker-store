package com.sneaker.sneakerstore.sneaker;

import com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces.IStore;
import com.sneaker.sneakerstore.sneaker.sneakerShop.nosql.StoreService;
//import com.sneaker.sneakerstore.sneaker.sneakerShop.spring.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
//@EnableJpaRepositories("com.sneaker.sneakerstore.sneaker.sneakerShop.spring")
//@EnableScan("edu.depaul.cdm.se.sampleproject.book.jpa")
public class ProjectApplication {


	public static void main(String[] args) {
		ProjectApplication main = new ProjectApplication();

		System.out.println("__Example___");
		SpringApplication.run(ProjectApplication.class, args);

        System.out.println("__MongoDB STARTS__");
		main.showStore("60603");

        System.out.println("");

		System.out.println("__PostgresSQL STARTS___");
		//Main.main2(args);
        //SpringApplication.run(Main.class);

	}

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
