package pl.edu.uwm.po.lab4;
import java.math.BigInteger;
import java.util.Scanner;

public class Zadanie4 {
    public Zadanie4(int n){

        BigInteger a = new BigInteger("1");
        BigInteger b = new BigInteger("2");
        BigInteger wynik=new BigInteger("0");
        for(int i=0; i<n*n; i++){
            wynik=wynik.add(a);
            a=a.multiply(b);

        }System.out.println(wynik.toString());
    }

}
