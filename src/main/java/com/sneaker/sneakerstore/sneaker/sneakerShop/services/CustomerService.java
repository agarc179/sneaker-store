package com.sneaker.sneakerstore.sneaker.sneakerShop.services;

import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Customer;
import com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces.ICustomer;
import com.sneaker.sneakerstore.sneaker.sneakerShop.repositories.CustomerRepository;
import com.sneaker.sneakerstore.sneaker.sneakerShop.repositories.SneakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository repository;

    @Autowired
    public void setCustomerRepository(CustomerRepository cp) { this.repository = cp; }

    public void saveCustomerRaffleInfo(){
        System.out.println(repository.count());
        Customer customer = new Customer();
        customer.setSneakerId((long) 9);
        customer.setName("Adrian");
        customer.setEmail("adrian@gmail.com");
        customer.setPhoneNumber("847-123-4567");

        repository.save(customer);

        System.out.println(repository.count());
    }

    public void saveCustomerRaffleInfo(Customer customer){
        System.out.println(repository.count());

        repository.save(customer);

        System.out.println(repository.count());
    }

    public Customer getCustomer(Long raffleId){

        //gets customer by raffle id
        Customer customer = repository.getOne(raffleId);

        return customer;

    }

    public List<Customer> getAllCustomers(){
        System.out.println(repository.count());
        return repository.findAll();
    }




}
