/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q2assignment;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */


class Inventory {
    private Product[] products;
    private int currentSize;

    public Inventory(int capacity) {
        products = new Product[capacity];
        currentSize = 0;
    }

    public void addProduct(Product product) {
        if (currentSize < products.length) {
            products[currentSize++] = product;
            System.out.println("Product added.");
        } else {
            System.out.println("Inventory full.");
        }
    }

    public void removeProduct(String productName) {
        for (int i = 0; i < currentSize; i++) {
            if (products[i].getName().equalsIgnoreCase(productName)) {
                products[i] = products[currentSize - 1]; // Replace with the last product
                products[currentSize - 1] = null; // Remove last product
                currentSize--;
                System.out.println("Product removed.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public int getCurrentSize() {
        return currentSize;
    }

    void viewInventory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void generateReport() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    

