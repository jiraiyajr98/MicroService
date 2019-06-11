package com.jiraiya.ageitemsservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "MapItems")
public class MapItems {

    private String value;
    private String category;

    public MapItems(String value, String category) {
        this.value = value;
        this.category = category;
    }

    public String getId() {
        return value;
    }

    public void setId(String value) {
        this.value = value;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
