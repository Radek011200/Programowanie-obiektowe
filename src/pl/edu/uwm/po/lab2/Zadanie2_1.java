package pl.edu.uwm.po.lab2;
import java.util.Scanner;

class Zadanie2_1 {
    int n;

    public int wczytaj() {
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj liczbe : ");
        return liczba.nextInt();

    }
    public void podpunktA(){
        int n = wczytaj();
        System.out.println("\nPodaj liczby :");
        Scanner liczba = new Scanner(System.in);
        int suma = 0;
        for(int i=1; i<=n; i++){
            if(liczba.nextInt()%2!=0)
                suma+=1;

        }System.out.printf("Wynik: %d\n", suma);
    }
    public void podpunktB(){
        int n = wczytaj();
        System.out.println("\nPodaj liczby :");
        Scanner liczba = new Scanner(System.in);
        int suma = 0;
        for(int i=1; i<=n; i++){
            int temp=liczba.nextInt();
            if(temp%3==0 && temp%5!=0)
                suma+=1;

        }System.out.printf("Wynik: %d\n", suma);
    }
    public void podpunktC(){
        int n = wczytaj();
        System.out.println("\nPodaj liczby :");
        Scanner liczba = new Scanner(System.in);
        int suma = 0;
        for(int i=1; i<=n; i++){

            if(Math.sqrt(liczba.nextInt())%2==0)
                suma+=1;

        }System.out.printf("Wynik: %d\n", suma);
    }
    public void podpunktF(){
        int n = wczytaj();
        System.out.println("\nPodaj liczby :");
        Scanner liczba = new Scanner(System.in);
        int suma = 0;
        for(int i=1; i<=n; i++){

            if(liczba.nextInt()%2==0 && i%2!=0)
                suma+=1;

        }System.out.printf("Wynik: %d\n", suma);
    }
    public void podpunktG(){
        int n = wczytaj();
        System.out.println("\nPodaj liczby :");
        Scanner liczba = new Scanner(System.in);
        int suma = 0;
        for(int i=1; i<=n; i++){
            int temp=liczba.nextInt();
            if(temp%2!=0 && temp>=0)
                suma+=1;

        }System.out.printf("Wynik: %d\n", suma);
    }
}
