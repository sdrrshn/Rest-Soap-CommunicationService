package com.example.resttest.Controller;

import com.example.resttest.data.CitiesRepository;
import com.example.resttest.entity.Cities;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cities")
public class CitiesController {
    private CitiesRepository citiesRepository;

    public CitiesController(CitiesRepository citiesRepository) {
        this.citiesRepository = citiesRepository;
    }


    @GetMapping("get")
    public Cities getCities(@RequestParam String name){
        return citiesRepository.getNameCities(name);
    }
}
