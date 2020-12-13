package pl.edu.uwm.po.lab13;

import java.util.Map;

import java.util.Scanner;
import java.util.TreeMap;

public class Zad2 {
    private static boolean True;

    public static String wczytaj() {
        Scanner wyraz = new Scanner(System.in);
        System.out.print("Podaj polecenie : ");

        return wyraz.nextLine();

    }
    public static void zad2 (TreeMap<String, String> mapa){
        System.out.println("Co chcesz zrobić? \nJeżeli chcesz dodać studenta i element to wpisz 'dodaj'\njezeli usunąć 'usun'\nzmiana oceny 'zmiana'\nwyswietl 'wyswietl'\nzakonczyc dzialanie programu 'zakoncz'");
        String coRobic=wczytaj();
        while(coRobic.equals("zakoncz") == True) {
            if (coRobic.equals("dodaj")) {
                System.out.println("Podaj nazwisko studenta");
                String nazwisko = wczytaj();
                System.out.println("podaj ocene");
                String ocena = wczytaj();
                mapa.put(nazwisko,ocena);
                System.out.println("Pomyślnie dodano studenta "+ nazwisko+": "+ ocena);

            }
            if (coRobic.equals("usun")){
                System.out.println("Podaj nazwisko studenta którego chcesz usunąć z listy ");
                String nazwisko = wczytaj();
                mapa.remove(nazwisko);
                System.out.println("Pomyślnie usunięto "+nazwisko+"z listy studentow");
            }
            if (coRobic.equals("zmiana")){
                System.out.println("Podaj nazwisko studenta");
                String nazwisko = wczytaj();
                System.out.println("jaką ocenę chcesz wstawić studentowi?");
                String ocena = wczytaj();
                mapa.replace(nazwisko,ocena);
                System.out.println("Pomyślnie zmieniono ocenę "+ nazwisko+" nowa ocena: "+ ocena);
            }
            if (coRobic.equals("wyswietl")) {
                for(String i: mapa.keySet()){
                    System.out.println(i+": "+mapa.get(i));

                }
            }
            System.out.println("Co teraz chcesz zrobic?");
            coRobic=wczytaj();
        }
    }
}
