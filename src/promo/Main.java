/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promo;

import java.util.Scanner;
/**
 *
 * @author root
 */
public class Main {
     public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);
        double amount;
        String kode_promo = "";
        Lebaran PromoLeb = new Lebaran();
        New_Year PromoYear = new New_Year();
        Harbolnas PromoHarb = new Harbolnas();
        
        System.out.print("Amount : ");
        amount = inputInt.nextInt();
        System.out.print("Kode Promo : ");
        kode_promo = inputStr.nextLine();
        
        switch(kode_promo.toLowerCase()){
            case "lebaran":
                PromoLeb.discount(amount);
                break;
            case "new year":
                PromoYear.discount(amount);
                break;
            case "harbolnas":
                PromoHarb.discount(amount);
                break;
            default:
                System.out.println("Amount Yang Harus Di Bayar = "+amount);
                break;
        }
    }
}
