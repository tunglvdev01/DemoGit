/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

/**
 *
 * @author ADMIN
 */
public class notaxproduct extends product {
    
    public notaxproduct(String name, double price) {
        super(name, price);
    }
    
    public double getImportTax() {
        return 0;
    }
}
