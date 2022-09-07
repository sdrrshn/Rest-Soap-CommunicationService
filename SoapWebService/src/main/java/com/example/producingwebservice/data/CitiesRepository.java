package com.example.producingwebservice.data;

import io.spring.guides.gs_producing_web_service.Cities;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CitiesRepository {
    private final static String FIND_BY_NAME_URL="http://localhost:3030/api/cities/get?name=";

    private final RestTemplate restTemplate;
    private Map<String, Cities> citiesMap = new HashMap<>();

    public CitiesRepository(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    @PostConstruct
    public void loadData(){
        Cities cities=new Cities();
        cities.setName("ADANA");
        cities.setPlate("01");

        citiesMap.put(cities.getName(),cities);
    }

    public Cities getCitiesName(String name){
     Cities result=   restTemplate.getForObject(FIND_BY_NAME_URL+name,Cities.class);
        return result;
    }

}
