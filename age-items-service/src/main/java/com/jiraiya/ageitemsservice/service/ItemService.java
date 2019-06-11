package com.jiraiya.ageitemsservice.service;

import com.jiraiya.ageitemsservice.model.ItemDetails;
import com.jiraiya.ageitemsservice.model.Items;
import com.jiraiya.ageitemsservice.model.MapItems;
import com.jiraiya.ageitemsservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public Items getCategory(String category)
    {
        ArrayList<ItemDetails> itemDetailsArrayList = new ArrayList<>();
        for(MapItems mapItems:itemRepository.findMapItemsByCategory(category) )
            itemDetailsArrayList.add(new ItemDetails(mapItems.getId()));
        return  new Items(itemDetailsArrayList);
    }

    public Items getAllItems()
    {
        ArrayList<ItemDetails> itemDetailsArrayList = new ArrayList<>();
        for(MapItems mapItems:itemRepository.findAll() )
            itemDetailsArrayList.add(new ItemDetails(mapItems.getId()));
        return new Items(itemDetailsArrayList);
    }
}
