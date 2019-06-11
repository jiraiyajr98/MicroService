package com.jiraiya.ageservice.model;

import java.util.ArrayList;

public class SuggestedObject {

    private String category;
    private int age;
    private ArrayList<ItemDetails> items;

    public SuggestedObject() {
    }

    public SuggestedObject(String category, int age, ArrayList<ItemDetails> items) {
        this.category = category;
        this.age = age;
        this.items = items;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<ItemDetails> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemDetails> items) {
        this.items = items;
    }
}
