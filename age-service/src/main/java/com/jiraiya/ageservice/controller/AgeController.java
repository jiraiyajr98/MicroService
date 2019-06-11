package com.jiraiya.ageservice.controller;

import com.jiraiya.ageservice.model.Items;
import com.jiraiya.ageservice.model.SuggestedObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AgeController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(path = "/getItems/{age}")
    public SuggestedObject getSuggestedObject(@PathVariable int age){

        String category =restTemplate.getForObject("http://category-service/category/"+age, String.class);
        Items items = restTemplate.getForObject("http://items-service/items/"+category, Items.class);
        return new SuggestedObject(category,age,items.getItemDetailsArrayList());
    }

}
