package pl.edu.uwm.po.lab4;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Zadanie5 {
    public Zadanie5(int k , int n, double p){
        BigDecimal a = new BigDecimal("1");

        BigDecimal odsetki = new BigDecimal(p);
        BigDecimal wynik= new BigDecimal(k);
        for(int i=0; i<n; i++){
            wynik=wynik.multiply(odsetki.add(a));


        }

        BigDecimal zaokraglone = wynik.setScale(2,5);
        System.out.println(zaokraglone.toString());

    }
}
