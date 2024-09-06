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
class Product {
    protected String name;
    protected int quantity;
    protected double price;

    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public void display() {
        System.out.printf("Product: %s, Quantity: %d, Price: %.2f%n", name, quantity, price);
    }
}

class Category extends Product {
    String categoryName;

    public Category(String name, int quantity, double price, String categoryName) {
        super(name, quantity, price);
        this.categoryName = categoryName;
    }

    @Override
    public void display() {
        System.out.printf("Product: %s, Quantity: %d, Price: %.2f, Category: %s%n", name, quantity, price, categoryName);
    }
}
