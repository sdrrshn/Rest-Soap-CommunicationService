package com.example.resttest.Controller;

import com.example.resttest.entity.Country;
import com.example.resttest.entity.Currency;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/country")
public class Controller {

    private Country country = new Country();


    public Controller() {

    }

    @GetMapping("get")
    public Country getCountry() {
        this.country.setCapital("sfafaf");
        this.country.setCurrency(Currency.EUR);
        this.country.setName("sidar");
        this.country.setPopulation(5);
        return country;
    }
}
