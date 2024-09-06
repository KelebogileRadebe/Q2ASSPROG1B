/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.q2assignment;
import java.util.Scanner;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */


class InventoryManagementAppTest {

    @Test
    void testAddProduct() {
        Inventory inventory = new Inventory(5);
        Product product = new Category("Laptop", 10, 999.99, "Electronics");
        inventory.addProduct(product);
        // Verify that currentSize is updated correctly
        assertEquals(1, inventory.getCurrentSize()); // Use a getter for currentSize
    }

    @Test
    void testRemoveProduct() {
        Inventory inventory = new Inventory(5);
        Product product = new Category("Laptop", 10, 999.99, "Electronics");
        inventory.addProduct(product);
        inventory.removeProduct("Laptop");
        // Verify that currentSize is updated correctly
        assertEquals(0, inventory.getCurrentSize()); // Use a getter for currentSize
    }

    @Test
    void testViewInventory() {
        Inventory inventory = new Inventory(5);
        Product product1 = new Category("Laptop", 10, 999.99, "Electronics");
        Product product2 = new Category("Mouse", 50, 19.99, "Accessories");
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        // Verify that currentSize is updated correctly
        assertEquals(2, inventory.getCurrentSize()); // Use a getter for currentSize
    }
}