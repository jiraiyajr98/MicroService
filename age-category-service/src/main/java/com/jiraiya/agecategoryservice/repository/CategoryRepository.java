package com.jiraiya.agecategoryservice.repository;

import com.jiraiya.agecategoryservice.models.CategoryDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CategoryRepository extends MongoRepository<CategoryDetails,Integer> {


//    @Bean
//    public CategoryList getCategory()
//    {
//        return new CategoryList(getCategoryArrayList());
//    }
//
//    private static  ArrayList<CategoryDetails> categoryArrayList = new ArrayList<>(Arrays.asList(
//            new CategoryDetails(5,10,"Kids"),
//            new CategoryDetails(11,23,"Student")
//    ));
//
//    private static ArrayList<CategoryDetails> getCategoryArrayList(){
//        return categoryArrayList;
//    }
}
