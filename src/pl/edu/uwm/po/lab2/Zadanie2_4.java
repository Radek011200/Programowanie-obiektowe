package pl.edu.uwm.po.lab2;

import java.util.Scanner;

public class Zadanie2_4 {
    public Zadanie2_4() {
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = liczba.nextInt();
        float max = 0;
        float min = 0;

        for (int i = 1; i <= n; i++) {
            float temp = liczba.nextFloat();

            if (temp > max) {
                max = temp;
            }
            if (temp < min) {
                min = temp;
            }
        } System.out.printf("Najmniejsza liczba to : %f\n Najwieksza liczba to : %f \n", min, max);
    }
}
