/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class bai02 {

    Scanner sc = new Scanner(System.in);
    ArrayList<product> ds = new ArrayList();

    public void nhapDs() {
        for (int i = 1; i <= 5; i++) {
            product p = new product();
            System.out.println("Nhap tt sp " + i);
            p.nhapTt();
            ds.add(p);
        }
    }

    public void xuatDs() {
        for (product pd : ds) {
            pd.xuatTt();
        }
    }
}
