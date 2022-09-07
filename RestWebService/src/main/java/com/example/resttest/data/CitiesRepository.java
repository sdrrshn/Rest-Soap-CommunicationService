package com.example.resttest.data;

import com.example.resttest.entity.Cities;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class CitiesRepository {
    private Map<String, Cities> citiesMap = new HashMap<>();

    @PostConstruct
    public void dataFill(){
        Cities cities=new Cities("adana","01");
        Cities cities1=new Cities("mersin","31");
        Cities cities2=new Cities("istanbul","34");
        Cities cities3=new Cities("tunceli","62");
        Cities cities4=new Cities("ankara","06");
        citiesMap.put(cities.getName(),cities);
        citiesMap.put(cities1.getName(),cities1);
        citiesMap.put(cities3.getName(),cities3);
        citiesMap.put(cities2.getName(),cities2);
        citiesMap.put(cities4.getName(),cities4);
    }
    public Cities getNameCities(String name){
        return citiesMap.get(name);
    }



}
