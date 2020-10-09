package pl.edu.uwm.po.lab2;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Zadanie2 {
    int n;
    public int wczytaj() {
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj liczbe : ");
        return liczba.nextInt();

    }
    public void zad2 (){
        int n = wczytaj();
        Scanner liczba = new Scanner((System.in));

        int temp=0;
        ArrayList<Integer> lista = new ArrayList<Integer>();
        System.out.print("Podaj liczbe : ");
        for (int i=1; i<=n; i++)

            if(i>1)
                lista.add(liczba.nextInt());


            else
                temp=liczba.nextInt();
                lista.add(temp);

        for (int i : lista) {
            System.out.print(i+", ");
        }







    }
}
