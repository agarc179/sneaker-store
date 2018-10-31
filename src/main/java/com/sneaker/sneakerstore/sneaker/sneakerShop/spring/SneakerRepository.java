package com.sneaker.sneakerstore.sneaker.sneakerShop.spring;

import com.sneaker.sneakerstore.sneaker.sneakerShop.spring.Sneaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SneakerRepository extends JpaRepository<Sneaker, Long> {
}
