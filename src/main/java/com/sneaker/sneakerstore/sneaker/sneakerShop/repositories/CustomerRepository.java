package com.sneaker.sneakerstore.sneaker.sneakerShop.repositories;

import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
