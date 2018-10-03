/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promo;

/**
 *
 * @author root
 */

public class Promo {
    Double potongan;
    Double total;
    Double bayaran;
}

class Lebaran extends Promo {
    void discount(double bayaran){
        potongan = (bayaran/100)*10;
        total = bayaran - potongan;
        System.out.println("Discount: 10%");
        System.out.println("Amount Yang Harus Di Bayar = "+total);
    }
}

class New_Year extends Promo {
    void discount(double bayaran){
        potongan = (bayaran/100)*5;
        total = bayaran - potongan;
        System.out.println("Discount: 20%");
        System.out.println("Amount Yang Harus Di Bayar = "+total);
    }
}

class Harbolnas extends Promo {
    void discount(double bayaran){
        potongan = (bayaran/100)*20;
        total = bayaran - potongan;
        System.out.println("Discount: 20%");
        System.out.println("Amount Yang Harus Di Bayar = "+total);
    }
}
