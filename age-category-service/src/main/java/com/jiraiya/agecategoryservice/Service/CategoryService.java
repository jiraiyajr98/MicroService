package com.jiraiya.agecategoryservice.Service;

import com.jiraiya.agecategoryservice.models.CategoryList;
import com.jiraiya.agecategoryservice.models.CategoryDetails;
import com.jiraiya.agecategoryservice.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public String getCategoryByAge(int age){
        CategoryList category = new CategoryList(categoryRepository.findAll());
        for(CategoryDetails categoryDetails:category.getCategoryArrayList())
        {
            if(categoryDetails.getMinAge() <= age && age <= categoryDetails.getMaxAge())
            {
                return categoryDetails.getCategory();
            }
        }
        return null;
    }

    public CategoryList getAllCategory(){
        return new CategoryList(categoryRepository.findAll());
    }
}
