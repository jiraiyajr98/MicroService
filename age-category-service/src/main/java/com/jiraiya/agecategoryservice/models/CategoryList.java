package com.jiraiya.agecategoryservice.models;


import java.util.ArrayList;
import java.util.List;

public class CategoryList {

    private List<CategoryDetails> categoryArrayList;

    public CategoryList() {
    }

    public CategoryList(List<CategoryDetails> categoryArrayList) {
        this.categoryArrayList = categoryArrayList;
    }

    public List<CategoryDetails> getCategoryArrayList() {
        return categoryArrayList;
    }

    public void setCategoryArrayList(ArrayList<CategoryDetails> categoryArrayList) {
        this.categoryArrayList = categoryArrayList;
    }
}
