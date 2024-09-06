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
class Category extends Product {
    private String categoryName;

    public Category(String name, int quantity, double price, String categoryName) {
        super(name, quantity, price);
        this.categoryName = categoryName;
    }

    @Override
    public void display() {
        System.out.printf("Product: %s, Quantity: %d, Price: %.2f, Category: %s%n", name, quantity, price, categoryName);
    }
}
