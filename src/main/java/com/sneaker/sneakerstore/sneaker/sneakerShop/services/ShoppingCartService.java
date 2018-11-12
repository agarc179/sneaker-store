package com.sneaker.sneakerstore.sneaker.sneakerShop.services;

// PostgresSQL ShoppingCart Service

import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.ShoppingCart;
import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Sneaker;
import com.sneaker.sneakerstore.sneaker.sneakerShop.repositories.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    ShoppingCartRepository repository;

    @Autowired
    public void setShoppingCartRepository(ShoppingCartRepository scp) { this.repository = scp; }

    // create a new entry in the shopping cart table
    public void saveSneakerInShoppingCart(){
        System.out.println(repository.count());
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setSneakerId(new Long(10));
        shoppingCart.setQuantity(3);

        repository.save(shoppingCart);

        System.out.println(repository.count());

    }

    public void saveSneakerInShoppingCart(ShoppingCart shoppingCart){
        repository.save(shoppingCart);
    }


    public List<ShoppingCart> getAllItems(){
        System.out.println(repository.count());
        return repository.findAll();
    }

}
