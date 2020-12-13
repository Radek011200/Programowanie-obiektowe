package pl.edu.uwm.po.lab13;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Zad3 {
    private static boolean True;
    private TreeMap<Student,String> oceny;
    private TreeMap<Integer,Student> indeks;

    public Zad3(){
        this.oceny=new TreeMap<>();
        this.indeks=new TreeMap<>();
    }

    public void zad3(){
        System.out.println("Co chcesz zrobić? \nJeżeli chcesz dodać studenta i element to wpisz 'dodaj'\njezeli usunąć 'usun'\nzmiana oceny 'zmiana'\nwyswietl 'wyswietl'\n zakonczyc dzialanie programu 'zakoncz'");
        String coRobic=wczytaj();
        while(coRobic.equals("zakoncz") == True) {
            if (coRobic.equals("dodaj")) {
                System.out.println("Podaj id studenta");
                int id = wczytajInta();
                System.out.println("podaj nazwisko studenta");
                String nazwisko = wczytaj();
                System.out.println("podaj imie studenta");
                String imie = wczytaj();
                System.out.println("podaj ocene");
                String ocena = wczytaj();

                this.oceny.put(new Student(id,nazwisko, imie),ocena);


                System.out.println("Pomyślnie dodano studenta "+ nazwisko+" "+imie+" "+id+": "+ ocena);

            }
            if (coRobic.equals("usun")){
                System.out.println("Podaj id studenta do usuniecia");
                int id = wczytajInta();
                for(int i: this.indeks.keySet()){
                    if( i == id){
                        this.oceny.remove(this.indeks.get(id));
                    }
                }

                this.indeks.remove(id);
                System.out.println("Pomyślnie usunięto studenta o identyfikatorze"+id);
            }
            if (coRobic.equals("zmiana")){
                System.out.println("Podaj id studenta");
                int id=wczytajInta();
                System.out.println("jaką ocenę chcesz wstawić studentowi?");
                String ocena = wczytaj();
                for(Student i : this.oceny.keySet()){
                    if(i.getId()==id){
                        this.oceny.replace(this.indeks.get(id),ocena);
                    }
                }
                System.out.println("Pomyślnie zmieniono ocenę :"+ ocena);
            }
            if (coRobic.equals("wyswietl")) {
                for(Student i: this.oceny.keySet()){
                    System.out.println(i.getId()+" "+i.getImie()+" "+i.getNazwisko()+" ocena :"+ this.oceny.get(i));

                }
            }
            System.out.println("Co teraz chcesz zrobic?");
            coRobic=wczytaj();
        }
    }
    public static String wczytaj() {
        Scanner wyraz = new Scanner(System.in);
        System.out.print("Podaj polecenie : ");

        return wyraz.nextLine();

    }
    public static int wczytajInta() {
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");

        return liczba.nextInt();

    }
}
