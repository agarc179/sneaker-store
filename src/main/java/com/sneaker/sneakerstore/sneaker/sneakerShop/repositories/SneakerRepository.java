package com.sneaker.sneakerstore.sneaker.sneakerShop.repositories;

import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Sneaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SneakerRepository extends JpaRepository<Sneaker, Long> {
}
