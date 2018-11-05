package com.sneaker.sneakerstore.sneaker.sneakerShop.controllers;

import com.sneaker.sneakerstore.sneaker.sneakerShop.RaffleInfo;
import com.sneaker.sneakerstore.sneaker.sneakerShop.entities.Store;
import com.sneaker.sneakerstore.sneaker.sneakerShop.interfaces.IStore;
import com.sneaker.sneakerstore.sneaker.sneakerShop.services.StoreService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SneakerShopController {
    StoreService storeService = new StoreService();

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
        model.addAttribute("raffle", new RaffleInfo());
        return "raffle";
    }

    @GetMapping("/storelookup")
    public String storeLookUpForm(Model model){
        model.addAttribute("storelookup", new Store());
        return "storelookup";
    }


    @PostMapping("/storelookup")
    public String storeLookUpSubmit(IStore store, Model model){
        List<IStore> stores = storeService.getStore(store.getZip());

        for(IStore s: stores){
            model.addAttribute("storelookup", s);
        }

        //model.addAttribute("storelookup", store);
        return "storelookup";
    }
}
