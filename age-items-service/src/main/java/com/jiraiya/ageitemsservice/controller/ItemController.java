package com.jiraiya.ageitemsservice.controller;

import com.jiraiya.ageitemsservice.model.Items;
import com.jiraiya.ageitemsservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    ItemService itemService;

    @GetMapping(path = "/items/{category}")
    public Items getItemsByCategory(@PathVariable String category){
        return itemService.getCategory(category);
    }

    @GetMapping(path = "/allCategories")
    public Items getAllItems()
    {
        return itemService.getAllItems();
    }
}
