package com.example.cart;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartServiceTest {

    @Test
    public void testAddItem() {
        CartService service = new CartService();
        service.addItem("Laptop", 50000, 1);

        assertEquals(50000, service.getTotal());
    }

    @Test
    public void testMultipleItems() {
        CartService service = new CartService();
        service.addItem("Phone", 20000, 2);
        service.addItem("Headphones", 2000, 1);

        assertEquals(42000, service.getTotal());
    }

    @Test
    public void testRemoveItem() {
        CartService service = new CartService();
        service.addItem("Mouse", 1000, 2);
        service.removeItem("Mouse");

        assertEquals(0, service.getTotal());
    }
}