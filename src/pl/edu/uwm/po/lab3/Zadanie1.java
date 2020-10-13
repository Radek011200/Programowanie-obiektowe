package pl.edu.uwm.po.lab3;

import java.util.Scanner;
import java.util.Random;


public class Zadanie1 {
    public Zadanie1() {
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj liczbe n: ");
        int n = liczba.nextInt();


        if(n<0 || n>100) {
            System.out.print("Podano zla liczbe. Podaj liczbe n z zakresu od 1 do 100");
            n = liczba.nextInt();
        }
        int[] tablica = new int[n];
        int[] tablicatymcz= new int[n];
        Random generator = new Random();

        for(int i=0; i<n; i++){
            tablica[i]=(generator.nextInt(1999)-1000);
            System.out.println(tablica[i]);

        }
        int sumaparzystych=0;
        int sumanieparzystych=0;
        int dodatnie=0;
        int ujemne=0;
        int zerowe=0;
        int min=0;
        int max=0;
        int smin=0;
        int swmax=0;
        int temp=0;
        int sumaujemnych=0;
        int sumadodatnich=0;
        int sasiednie=0;
        int sumasasiednich=0;
        for(int i=0; i<n; i++){
            if(tablica[i]%2==0){
                sumaparzystych+=1;
            }
            else{
                sumanieparzystych+=1;
            }
            if(tablica[i]>0){
                dodatnie+=1;
            }
            if(tablica[i]<0)
            {
                ujemne+=1;
            }
            if(tablica[i]==0)
            {
                zerowe+=1;
            }
            if(tablica[i]>=max){
                temp=max;
                max=tablica[i];
                if(max>temp){
                    swmax=1;
                }
                if(temp==max)
                {

                    swmax+=1;
                }
            }
            if(tablica[i]<0)
            {
                sumaujemnych+=tablica[i];
            }
            if(tablica[i]>0)
            {
                sumadodatnich+=tablica[i];
            }
            if(tablica[i]>0){
                sasiednie+=1;
            }
            if(sasiednie>sumasasiednich)
            {
                sumasasiednich=sasiednie;
            }
            if(tablica[i]<0)
            {
                sasiednie=0;
            }

        }
        System.out.printf("\na) Suma liczb parzystych w tablicy: %d , a liczb nieparzystych %d\nb) Suma liczb dodatnich: %d , Suma liczb ujemnych: %d , Suma liczb zerowych: %d\nc)Najwiekszy element to: %d i wystepuje %d w tablicy\nd)Suma elementow ujemnych %d suma elementow dodatnich %d\ne)Suma obok siebie %d\nf) ",sumaparzystych, sumanieparzystych,dodatnie,ujemne,zerowe,max,swmax,sumaujemnych,sumadodatnich,sumasasiednich);
        for(int i =0; i<n; i++)
        {
            if(tablica[i]>0){
                tablicatymcz[i]=1;
            }
            if(tablica[i]<0){
                tablicatymcz[i]=-1;
            }
            System.out.printf("%d, ",tablicatymcz[i]);
        }

        System.out.print("\nPodaj lewa liczbe nie wieksza niz n i wieksza niz 0: ");
        int lewa = liczba.nextInt();
        System.out.print("\nPodaj prawa liczbe nie wieksza niz n i wieksza niz 0: ");
        int prawa = liczba.nextInt();

        if(prawa<lewa){
            int temp2=0;
            temp=prawa;
            prawa=lewa;
            lewa=temp2;
        }
        int temp2;
        for(int i = lewa; i< prawa; i++)
        {
            temp2=tablica[i];
            tablica[i]=tablica[prawa];
            tablica[prawa--]=temp2;
        }
        System.out.printf("g) ");
        for(int i=0; i<n; i++){
            System.out.printf("%d, ",tablica[i]);
        }



    }
}
