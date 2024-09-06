/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q2assignment;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */

public class InventoryManagementApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory(10);

        while (true) {
            System.out.println("1. Add Product\n2. Remove Product\n3. View Inventory\n4. Generate Report\n5. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Adding a product
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    
                    System.out.print("Enter quantity: ");
                    int quantity = 0;
                    while (true) {
                        try {
                            quantity = Integer.parseInt(scanner.nextLine());
                            if (quantity < 0) {
                                System.out.println("Quantity must be non-negative. Please enter again.");
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid integer for quantity.");
                        }
                    }
                    
                    System.out.print("Enter price: ");
                    double price = 0.0;
                    while (true) {
                        try {
                            price = Double.parseDouble(scanner.nextLine());
                            if (price < 0) {
                                System.out.println("Price must be non-negative. Please enter again.");
                            } else {
                                break;
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input. Please enter a valid number for price.");
                        }
                    }
                    
                    System.out.print("Enter category name: ");
                    String categoryName = scanner.nextLine();
                    
                    Product product = new Category(name, quantity, price, categoryName);
                    inventory.addProduct(product);
                    break;

                case 2:
                    // Removing a product
                    System.out.print("Enter product name to remove: ");
                    String productName = scanner.nextLine();
                    inventory.removeProduct(productName);
                    break;

                case 3:
                    // Viewing inventory
                    inventory.viewInventory();
                    break;

                case 4:
                    // Generating report
                    inventory.generateReport();
                    break;

                case 5:
                    // Exiting the application
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    // Invalid choice handling
                    System.out.println("Invalid choice. Try again.");
            }
        }    
    }   
}