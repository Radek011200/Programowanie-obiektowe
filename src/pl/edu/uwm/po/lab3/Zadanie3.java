package pl.edu.uwm.po.lab3;


import java.util.Random;
import java.util.Scanner;

public class Zadanie3 {
    public Zadanie3(){
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj liczbe z przedzialu od 1 do 10");
        int m=liczba.nextInt();
        System.out.print("Podaj liczbe z przedzialu od 1 do 10");
        int n=liczba.nextInt();
        System.out.print("Podaj liczbe z przedzialu od 1 do 10");
        int k=liczba.nextInt();

        int[][] a = new int [m][n];
        generujMacierz(a,m,n);
        wypiszM(a);
        int[][] b = new int [n][k];
        generujMacierz(b,n,k);
        wypiszM(b);
        int[][] c = mnozenieMacierzy(a,b);
        System.out.println("Wynik mnozenia");
        wypiszM(c);


    }
    public static void generujMacierz(int[][] tab, int k, int w){
        for(int i=0; i<k; i++)
        {
            for(int j=0;j<w;j++){
                tab[i][j]=generujLiczbe(0,100);
            }
        }
    }
    public static int[][] mnozenieMacierzy(int[][] tab, int[][] tab2)
    {
        int tabWiersze=tab.length;
        int tabKolumny=tab[0].length;
        int tab2Wiersze=tab.length;

        if(tabKolumny != tab2Wiersze){
            System.out.println("Liczba kolumn 1 macierzy ma byc rowna wierszom drugiej macierzy");
            return null;
        }
        int[][] suma= new int[tabKolumny][tab2Wiersze];
        for(int i=0; i<tabKolumny; i++){
            for(int j=0; j<tab2Wiersze; j++){
                for(int k=0; k<tabWiersze; k++){
                    suma[i][j]+=tab[i][k]*tab2[k][j];
                }
            }
        }
        return suma;
    }
    public static int generujLiczbe(int min, int max)
    {
        Random ran = new Random();
        return ran.nextInt(max-min)+min;
    }
    public static void wypiszM(int[][] tab)
    {
        for(int i=0;i<tab.length; i++)
        {
            for(int j=0; j<tab[i].length; j++){
                System.out.printf("%d ", tab[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
