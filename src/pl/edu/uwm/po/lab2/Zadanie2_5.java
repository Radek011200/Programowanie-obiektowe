package pl.edu.uwm.po.lab2;

import java.util.Scanner;

public class Zadanie2_5 {
    public Zadanie2_5() {
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = liczba.nextInt();
        float last = -20;
        int suma = 0;

        for (int i = 1; i <= n; i++) {
            float temp = liczba.nextFloat();
            if (last > 0 && temp > 0) {
                suma += 1;
            }
            last = temp;
        }
        System.out.printf("Liczba par wynosi: %d", suma);
    }
    }


