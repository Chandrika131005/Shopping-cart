package com.example.cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String name) {
        items.removeIf(item -> item.getName().equalsIgnoreCase(name));
    }

    public double calculateTotal() {
        return items.stream().mapToDouble(Item::getTotalPrice).sum();
    }

    public List<Item> getItems() {
        return items;
    }
}