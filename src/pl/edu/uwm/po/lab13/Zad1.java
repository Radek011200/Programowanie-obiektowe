package pl.edu.uwm.po.lab13;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Zad1 {
    private static boolean True;

    public static String wczytaj() {
        Scanner wyraz = new Scanner(System.in);
        System.out.print("Podaj polecenie :  ");

        return wyraz.nextLine();

    }
    public static void zad1 (PriorityQueue<String> Queue){
        System.out.println("Co chcesz zrobić?\nJeżeli chcesz dodać opis to wpisz: dodaj priorytet opis\nJeżeli nastepne to: nastepne\nJeżeli zakończyć to: zakoncz");
        String wyraz=wczytaj();
        String koniec = "zakoncz";
        while (wyraz.equals(koniec)==True){
            String[] Sprawdz = wyraz.split(" ");
            String opis="";
            int temp=0;
            int licznikPrio=0;
            for(String i:Sprawdz){
                if(i.equals("dodaj") || i.equals("priorytet")){
                    temp+=1;
                }
                else if(i.equals("nastepne")){
                    Queue.remove();

                }
            }
            if(temp==2){
                int temp2=0;
                for(String i:Sprawdz){
                    if(temp2>1){
                        opis+=i+" ";

                    }
                    licznikPrio+=1;
                    temp2+=1;
                }
                Queue.add(opis);
            }

            System.out.println(Queue);
            wyraz=wczytaj();


        }


    }
}
