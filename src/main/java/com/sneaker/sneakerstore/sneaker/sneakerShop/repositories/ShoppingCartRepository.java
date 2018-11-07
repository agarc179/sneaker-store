package com.sneaker.sneakerstore.sneaker.sneakerShop.repositories;

import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {
}
