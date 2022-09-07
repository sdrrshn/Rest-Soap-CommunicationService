package com.example.resttest.entity;


import com.example.resttest.entity.Currency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country {


    protected String name;
    protected int population;

    protected String capital;

    protected Currency currency;
}