package com.jiraiya.ageitemsservice.model;

import java.util.ArrayList;

public class Items {

    private ArrayList<ItemDetails> itemDetailsArrayList;

    public Items(ArrayList<ItemDetails> itemDetailsArrayList) {
        this.itemDetailsArrayList = itemDetailsArrayList;
    }

    public ArrayList<ItemDetails> getItemDetailsArrayList() {
        return itemDetailsArrayList;
    }

    public void setItemDetailsArrayList(ArrayList<ItemDetails> itemDetailsArrayList) {
        this.itemDetailsArrayList = itemDetailsArrayList;
    }
}
