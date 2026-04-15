package com.example.cart;

public class CartService {

    private Cart cart = new Cart();

    public void addItem(String name, double price, int quantity) {
        cart.addItem(new Item(name, price, quantity));
    }

    public void removeItem(String name) {
        cart.removeItem(name);
    }

    public double getTotal() {
        return cart.calculateTotal();
    }
}