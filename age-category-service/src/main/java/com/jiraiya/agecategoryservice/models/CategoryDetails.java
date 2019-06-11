package com.jiraiya.agecategoryservice.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "CategoryDetails")
public class CategoryDetails {

    private int minAge;
    private int maxAge;
    private String category;

    public CategoryDetails() {
    }

    public CategoryDetails(int minAge, int maxAge, String category) {
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.category = category;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
