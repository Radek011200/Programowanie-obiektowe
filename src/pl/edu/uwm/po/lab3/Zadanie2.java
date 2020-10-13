package pl.edu.uwm.po.lab3;

import java.util.Random;
import java.util.Scanner;

public class Zadanie2 {
    public Zadanie2()
    {
        Scanner liczba = new Scanner(System.in);
        int[] tablica = nowatablica();
        System.out.printf("Nieparzystych jest: %d\n", ileNieparzystych(tablica));
        tablica = nowatablica();
        System.out.printf("Parzystych jest: %d\n", ileParzystych(tablica));
        tablica = nowatablica();
        System.out.printf("Dodatnich jest: %d\n",ileDodatnich(tablica));
        tablica = nowatablica();
        System.out.printf("Ujemnych jest: %d\n", ileUjemnych(tablica));
        tablica = nowatablica();
        System.out.printf("Zerowych jest: %d\n", ileZerowych(tablica));
        tablica = nowatablica();
        System.out.printf("Maksymalnych jest: %d\n", ileMaksymalnych(tablica));
        tablica = nowatablica();
        System.out.printf("Suma Dodatnich wynosi: %d\n", sumaDodatnich(tablica));
        tablica = nowatablica();
        System.out.printf("Suma Ujemnych wynosi: %d\n", sumaUjemnych(tablica));
        tablica = nowatablica();
        System.out.printf("Dlugosc maksymalnego ciagu dodatnich: %d\n", dlugoscMaksymalnegoCiaguDodatnich(tablica));
        tablica=nowatablica();
        System.out.print("Signum: \n");
        signum(tablica);
        System.out.print("\nOdwracanie wybranego fragmentu: \n");
        tablica=nowatablica();
        System.out.print("\nPodaj z lewej: \n");
        int lewy=liczba.nextInt();
        System.out.print("\nPodaj z prawej: \n");
        int prawy=liczba.nextInt();
        odwrocFragment(tablica,lewy,prawy);
    }


    public static int ileNieparzystych(int tab[]){
        int suma=0;
        for(int i=1; i<=tab.length; i++){
            if(i%2!=0){
                suma+=1;
            }
        }return suma;
    }
    public static int ileParzystych(int tab[]){
        int suma=0;
        for(int i=1; i<=tab.length; i++){
            if(i%2==0){
                suma+=1;
            }
        }return suma;
    }
    public static int ileDodatnich(int tab[]){
        int suma=0;
        for (int i=1; i<tab.length; i++){
            if(tab[i]>0){
                suma+=1;
            }
        }return suma;
    }
    public static int ileUjemnych(int tab[]){
        int suma=0;
        for (int i=1; i<tab.length; i++){
            if(tab[i]<0){
                suma+=1;
            }
        }return suma;
    }
    public static int ileZerowych(int tab[]){
        int suma=0;
        for (int i=1; i<tab.length; i++){
            if(tab[i]==0){
                suma+=1;
            }
        }return suma;
    }
    public static int ileMaksymalnych(int tab[]){
        int suma=0;
        for (int i=1; i<tab.length; i++){
            int temp=0;
            if(tab[i]==temp){
                suma+=1;
            }
            if(tab[i]>temp){
                temp=tab[i];
                suma=1;
            }
        }return suma;
    }
    public static int sumaDodatnich(int tab[]){
        int suma=0;
        for (int i=1; i<tab.length; i++){
            if(tab[i]>0){
                suma+=tab[i];
            }
        }return suma;
    }
    public static int sumaUjemnych(int tab[]){
        int suma=0;
        for (int i=1; i<tab.length; i++){
            if(tab[i]<0){
                suma+=tab[i];
            }
        }return suma;
    }
    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]){
        int suma=0;
        int Ssuma=0;
        for (int i=1; i<tab.length; i++){
            if(tab[i]>0){
                Ssuma+=1;
            }
            if(Ssuma>suma){
                suma=Ssuma;
            }
            if(tab[i]<0){
                Ssuma=0;
            }

        }return suma;
    }
    public static void signum(int tab[]){
        for (int i=0; i<tab.length; i++){
            if(tab[i]>0){
                tab[i]=1;
            }
            if(tab[i]<0){
                tab[i]=-1;
            }
            if(tab[i]==0){
                tab[i]=0;
            }
        }
        wypisz(tab);
    }
    public static void odwrocFragment(int tab[],int lewy, int prawy){
        int temp;

        if(prawy<lewy){
            int temp2=0;
            temp=prawy;
            prawy=lewy;
            lewy=temp2;
        }
        int temp2;
        for(int i = lewy; i< prawy; i++)
        {
            temp2=tab[i];
            tab[i]=tab[prawy];
            tab[prawy--]=temp2;
        }
    wypisz(tab);
    }
    public static int wczytajn(){
        Scanner liczba = new Scanner(System.in);
        int n;
        System.out.print("Podaj liczbe n:");
        n=liczba.nextInt();
        while(n>100 || n<1)
        {
            System.out.print("Podaj liczbe z zakresu 1-100!:  ");
            n=liczba.nextInt();

        }
        return n;
    }
    public static int[] nowatablica(){
        int[] tab = new int[wczytajn()];
        generuj(tab,-999,999);
        wypisz(tab);
        return tab;
    }
    public static void generuj (int[] tablica, int minimalna, int maksymalna) {
        Random liczba = new Random();
        for (int i = 0; i < tablica.length; ++i) {
            tablica[i] = liczba.nextInt(maksymalna-minimalna)+minimalna;
        }
    }
    public static void wypisz(int[] tablica) {
        for (int i : tablica) {
            System.out.printf("%d ",i);
        }
        System.out.println("");
    }

}
