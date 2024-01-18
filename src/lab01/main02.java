/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author ADMIN
 */
public class main02 {
    public static void main(String[] args) {
        notaxproduct product1 = new notaxproduct("Sản phẩm A", 100);
        notaxproduct product2 = new notaxproduct("Sản phẩm B", 200);
        notaxproduct product3 = new notaxproduct("Sản phẩm C", 300);

        System.out.println("Thông tin các sản phẩm:");
        System.out.println("Sản phẩm 1:");
        System.out.println("Tên sản phẩm: " + product1.getName());
        System.out.println("Thuế nhập khẩu: " + product1.getImportTax());
        System.out.println("---------------------------");

        System.out.println("Sản phẩm 2:");
        System.out.println("Tên sản phẩm: " + product2.getName());
        System.out.println("Thuế nhập khẩu: " + product2.getImportTax());
        System.out.println("---------------------------");

        System.out.println("Sản phẩm 3:");
        System.out.println("Tên sản phẩm: " + product3.getName());
        System.out.println("Thuế nhập khẩu: " + product3.getImportTax());
        System.out.println("---------------------------");
    }
}
