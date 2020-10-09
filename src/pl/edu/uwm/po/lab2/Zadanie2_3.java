package pl.edu.uwm.po.lab2;

import java.util.Scanner;

public class Zadanie2_3 {
    public Zadanie2_3(){
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = liczba.nextInt();
        int sumaD=0;
        int sumaU=0;
        int suma0=0;
        for(int i=1; i<=n; i++) {
            float temp=liczba.nextFloat();
            if (temp>0)
            {
                sumaD+=1;
            }
            if(temp<0)
            {
                sumaU+=1;
            }
            if(temp==0){
                suma0+=1;
            }
        }



        System.out.printf("Suma dodatnich : %d \nSuma ujemnych :%d \n Suma zer : %d\n", sumaD , sumaU , suma0);
    }
}


