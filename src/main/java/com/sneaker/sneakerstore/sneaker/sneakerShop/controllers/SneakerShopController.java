package com.sneaker.sneakerstore.sneaker.sneakerShop.controllers;

import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Customer;
import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.RaffleInfo;
import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Sneaker;
import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Store;
import com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces.ICustomer;
import com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces.IStore;
import com.sneaker.sneakerstore.sneaker.sneakerShop.services.CustomerService;
import com.sneaker.sneakerstore.sneaker.sneakerShop.services.SneakerService;
import com.sneaker.sneakerstore.sneaker.sneakerShop.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class SneakerShopController {
    StoreService storeService = new StoreService();

    @Autowired
    private CustomerService customerService;

    @Autowired
    private SneakerService sneakerService;

    @Value("${spring.application.name}")
    private String appName;

    @GetMapping("/")
    public String homePage(Model model){
        model.addAttribute("appName", appName);
        return "index";
    }

    @GetMapping("/store")
    public String storePage(Model model){
        return "store";
    }

    @GetMapping("/raffle")
    public String raffleForm(Model model){
        model.addAttribute("customer", new Customer());
        return "raffle";
    }


    @PostMapping("/raffle")
    public String raffleSubmit(Customer customer, Model model){
        model.addAttribute("customer", customer);

        customerService.saveCustomerRaffleInfo(customer);

        Customer c = customerService.getCustomer(customer.getRaffleId());
        model.addAttribute("customer", c);

        Sneaker sneaker = sneakerService.getSneaker(c.getSneakerId());

        model.addAttribute("sneaker", sneaker);
//
//        RaffleInfo raffleInfo = new RaffleInfo();
//        raffleInfo.setRaffleId(c.getRaffleId());
//        raffleInfo.setEmail(c.getEmail());
//        raffleInfo.setName(c.getName());
//        raffleInfo.setPhoneNumber(c.getPhoneNumber());
//        raffleInfo.setBrand(sneaker.getBrand());
//        raffleInfo.setSneakerName(sneaker.getName());
//
//        model.addAttribute("raffleInfo", raffleInfo);

        return "raffle";
    }

    @GetMapping("/storelookup")
    public String storeLookUpForm(Model model){
        model.addAttribute("store", new Store());
        return "storelookup";
    }


    @PostMapping("/storelookup")
    public String storeLookUpSubmit(IStore store, Model model){
        List<IStore> stores = storeService.getStore(store.getZip());

        for(IStore s: stores){
            model.addAttribute("store", s);
        }

        return "storelookup";
    }
}
