package pl.edu.uwm.po.lab2;
import java.util.Scanner;

public class Zadanie2_2 {
    public Zadanie2_2(){
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = liczba.nextInt();
        float suma=0;
        for(int i=1; i<=n; i++) {
            float temp=liczba.nextFloat();
            if (temp > 0)
                suma += temp*2;
        } System.out.printf("Wynik: %f\n", suma);
    }
}
