package com.jiraiya.ageitemsservice.repository;

import com.jiraiya.ageitemsservice.model.MapItems;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface ItemRepository extends MongoRepository<MapItems,Integer> {

    ArrayList<MapItems> findMapItemsByCategory(String category);

//    private static ArrayList<MapItems> mapItemsArrayList = new ArrayList<>(Arrays.asList(
//            new MapItems("Food","Student"),
//            new MapItems("Health","Student"),
//            new MapItems("Games","Kids")));


}
