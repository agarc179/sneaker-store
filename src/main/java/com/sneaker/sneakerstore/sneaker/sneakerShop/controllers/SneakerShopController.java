package com.sneaker.sneakerstore.sneaker.sneakerShop.controllers;

import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Customer;
import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.ShoppingCart;
import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Sneaker;
import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Store;
import com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces.IStore;
import com.sneaker.sneakerstore.sneaker.sneakerShop.services.CustomerService;
import com.sneaker.sneakerstore.sneaker.sneakerShop.services.ShoppingCartService;
import com.sneaker.sneakerstore.sneaker.sneakerShop.services.SneakerService;
import com.sneaker.sneakerstore.sneaker.sneakerShop.services.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SneakerShopController {
    StoreService storeService = new StoreService();

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ShoppingCartService shoppingCartService;

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
        model.addAttribute("shoppingCart", new ShoppingCart());
        return "store";
    }

    @PostMapping("/store")
    public String sneakerSubmit(ShoppingCart shoppingCart, Model model){

        model.addAttribute("shoppingCart", shoppingCart);

        shoppingCartService.saveSneakerInShoppingCart(shoppingCart);

        return "store";
    }

    @GetMapping("/shoppingCart")
    public String shoppingCartPage(Model model){

        List<ShoppingCart> shoppingCartList = shoppingCartService.getAllItems();
        model.addAttribute("shoppingCartList", shoppingCartList);

        List<Sneaker> sneakerList = sneakerService.getAllSneakers();
        model.addAttribute("sneakerList", sneakerList);
        
        return "shoppingCart";
    }

    @GetMapping("/raffle")
    public String raffleForm(Model model){
        model.addAttribute("customer", new Customer());
        model.addAttribute("sneaker", new Sneaker());
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
