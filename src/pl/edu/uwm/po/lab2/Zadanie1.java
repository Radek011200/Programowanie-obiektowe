package pl.edu.uwm.po.lab2;
import java.util.Scanner;







class Zadanie1 {
    int n;


    public int wczytaj() {
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj liczbe : ");
        return liczba.nextInt();

    }

    public void podpunktA(){
        int n = wczytaj();
        System.out.println("\nDodawanie");
        Scanner liczba = new Scanner(System.in);
        int suma = 0;
        for (int i = 1; i<= n; i++){
            System.out.print("Liczba " + i +": ");
            suma+=liczba.nextInt();
        }
        System.out.printf("Wynik: %d\n", suma);
    }
    public void podpunktB(){
        int n = wczytaj();
        System.out.println("\nMnozenie");
        Scanner liczba = new Scanner(System.in);
        int suma =1;
        for (int i=1; i<=n; i++){
            System.out.print("Liczba" + i +": ");
            suma*=liczba.nextInt();

        }
        System.out.printf("Wynik: %d", suma);
    }
    public void podpunktC(){
        int n = wczytaj();
        System.out.println("\nZamiana na liczby bezwgledne i dodawanie");
        Scanner liczba = new Scanner(System.in);
        int suma =0;
        for(int i=1; i<=n; i++){
            System.out.print("Liczba" + i +"; ");
            suma+=Math.abs(liczba.nextInt());
        }
        System.out.printf("Wynik: %d", suma);

    }
    public void podpunktD(){
        int n = wczytaj();
        System.out.println("\nliczby bezwgledne pod pierwiastkiem");
        Scanner liczba = new Scanner(System.in);
        int suma =0;
        for(int i=1; i<=n; i++){
            System.out.print("Liczba" + i +"; ");
            int l=Math.abs(liczba.nextInt());
            suma+=Math.sqrt(l);
        }
        System.out.printf("Wynik: %d", suma);

    }
    public void podpunktE(){
        int n = wczytaj();
        System.out.println("\nMnozenie liczb bezwglednych");
        Scanner liczba = new Scanner(System.in);
        int suma =1;
        for(int i=1; i<=n; i++){
            System.out.print("Liczba" + i +"; ");

            suma*=Math.abs(liczba.nextInt());
        }
        System.out.printf("Wynik: %d", suma);

    }
    public void podpunktF(){
        int n = wczytaj();
        System.out.println("\nDodawanie liczb podniesionych do kwadratu");
        Scanner liczba = new Scanner(System.in);
        int suma =0;
        for(int i=1; i<=n; i++){
            System.out.print("Liczba" + i +"; ");

            suma+=Math.pow(liczba.nextInt(),2);
        }
        System.out.printf("Wynik: %d", suma);

    }
    public void podpunktG(){
        int n = wczytaj();
        System.out.println("\nDodawanie i mnozenie liczb");
        Scanner liczba = new Scanner(System.in);
        int suma =0;
        int suma2 =1;
        for(int i=1; i<=n; i++){
            System.out.print("Liczba" + i +"; ");
            int l=liczba.nextInt();
            suma+=l;
            suma2*=l;
        }
        System.out.printf("Wynik dodawania: %d i wynik mnozenia: %d", suma, suma2);

    }
    public void podpunktH(){
        int n = wczytaj();
        System.out.println("\n(-1)^(n+1)*an");
        Scanner liczba = new Scanner(System.in);
        int suma =0;

        for(int i=1; i<=n; i++){
            System.out.print("Liczba" + i +"; ");

            suma+= ((liczba.nextInt())*(Math.pow(-1,i+1)));

        }
        System.out.printf("Wynik : %d", suma);

    }
    public void podpunktI(){
        int n = wczytaj();

        Scanner liczba = new Scanner(System.in);
        int suma =0;
        int silnia=1;
        for(int i=1; i<=n; i++){
            System.out.print("Liczba" + i +"; ");

            silnia*=i;
            suma+=((liczba.nextInt())*(Math.pow(-1,i)) / silnia);


        }
        System.out.printf("Wynik : %d ", suma);

    }


}
