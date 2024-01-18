/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class product {
    Scanner sc = new Scanner(System.in);
    String name;
    double price;

    public product() {
    }

    public product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getImportTax(double price) {
        return price * 0.1;
    }
    public void nhapTt() {
        System.out.print("Nhập name: ");
        name = sc.nextLine();
        System.out.print("Nhập giá: ");
        price = sc.nextDouble();
        sc.nextLine();
    }
    public void xuatTt() {
        System.out.println(name + " - " + price + " - " + getImportTax(price));
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
