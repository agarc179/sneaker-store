package com.sneaker.sneakerstore.sneaker.sneakerShop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SneakerShopController {

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
        model.addAttribute("storelookup", new StoreLookUp());
        return "storelookup";
    }
}
