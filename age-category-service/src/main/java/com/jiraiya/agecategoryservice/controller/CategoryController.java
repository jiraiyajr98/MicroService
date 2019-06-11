package com.jiraiya.agecategoryservice.controller;

import com.jiraiya.agecategoryservice.Service.CategoryService;
import com.jiraiya.agecategoryservice.models.Category;
import com.jiraiya.agecategoryservice.models.CategoryList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping(path = "/category/{age}")
    public String getCategory(@PathVariable int age){
        return categoryService.getCategoryByAge(age);
    }

    @GetMapping(path = "/categories")
    public CategoryList getAllCategory(){
        return categoryService.getAllCategory();
    }

}
