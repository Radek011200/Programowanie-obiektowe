package pl.edu.uwm.po.lab12;

import pl.edu.uwm.po.lab6.IntegerSet;

import java.util.NoSuchElementException;
import java.util.*;

public class lab12 {
    public static void main(String[] args){
        LinkedList<String> pracownik = new LinkedList<String>();
        pracownik.add("Mariusz");
        pracownik.add("Mateusz");
        pracownik.add("Albert");
        pracownik.add("Jan");
        pracownik.add("Janusz");
        pracownik.add("Sebastian");
        pracownik.add("Daniel");
        System.out.println("Zadanie 1 i 2 ");
        redukuj(pracownik,2);
        System.out.println("Aktualna lista pracowników " + pracownik);
        LinkedList<Integer> ine = new LinkedList<Integer>();
        ine.add(1);
        ine.add(5);
        ine.add(2);
        ine.add(9);
        ine.add(3);
        ine.add(20);
        ine.add(15);
        redukuj(ine,2);
        System.out.println("Aktualna lista intów " +ine);
        System.out.println("Zadanie 3 i 4");
        System.out.println("Lista przed odwróceniem "+ pracownik);
        odwroc(pracownik);
        System.out.println("Lista po odwróceniu "+ pracownik);
        System.out.println("Lista przed odwróceniem "+ ine);
        odwroc(ine);
        System.out.println("Lista po odwróceniu "+ ine);
        Stack<String> stos = new Stack<String>();
        stos.push("Ala");
        stos.push("ma");
        stos.push("kota.");
        stos.push(" Jej");
        stos.push("kot");
        stos.push("lubi");
        stos.push("myszy.");
        System.out.println("Zadanie 5 ");
        odwroc2(stos);
        for(String i:stos){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Zadanie 6");
        wypiszLiczbe();
        System.out.println("\nZadanie 7");
        Erastenes();
        System.out.println("\nZadanie 8");
        print(ine);
        print(pracownik);


    }
    public static <T> void redukuj (LinkedList<T> pracownicy, int n){
        int temp=1;
        LinkedList<T> tymczasowa = new LinkedList<T>();
        for(T pracownik : pracownicy){

            if(temp %n==0){

                System.out.println("Usuwam pracownika "+ pracownik);
                tymczasowa.add(pracownik);

            }
            temp+=1;

        }
        pracownicy.removeAll(tymczasowa);
    }
    public static <T> void odwroc(LinkedList<T> lista){
        LinkedList<T> Tymczasowa= new LinkedList<T>();
        for(int i= lista.size()-1; i>=0; i--){
            Tymczasowa.add(lista.get(i));

        }
        lista.clear();
        lista.addAll(Tymczasowa);

    }
    public static Stack<String> odwroc2(Stack<String> stack){
        int temp=0;
        ArrayList<String> listaWyrazow= new ArrayList<String>();
        Stack<String> tymczasowy2 = new Stack<String>();
        for(String wyraz: stack){
            temp+=1;
            char kropka='.';
            for (int j=0; j<wyraz.length(); j++){
                char litera= wyraz.charAt(j);
                    if(litera==kropka){
                        String wyraz2 = wyraz.replace(".", "");
                        String wyraz3 = wyraz2.substring(0, 1).toUpperCase() + wyraz2.toLowerCase().substring(1);
                        listaWyrazow.add(wyraz3);
                        temp=0;
                        Collections.reverse(listaWyrazow);
                        String wyraz5 = listaWyrazow.get(listaWyrazow.size()-1)+".";
                        listaWyrazow.set(listaWyrazow.size()-1,wyraz5);
                        for(String l: listaWyrazow){
                            tymczasowy2.add(l);
                        }
                        listaWyrazow.clear();
                    }
                    else{
                        if(temp==wyraz.length()){
                            String wyraz4 = wyraz.toLowerCase();
                            listaWyrazow.add(wyraz4);
                            temp=0;
                        }
                        else{
                            temp+=1;
                        }
                    }
            }
        }
        stack.clear();
        stack.addAll(tymczasowy2);
        return stack;
    }
    public static void wypiszLiczbe () {
        int liczba = wczytaj();
        Stack<Integer> stosik = new Stack<Integer>();


        if (liczba > 0) {
            while (liczba > 0) {

                stosik.push(liczba % 10);
                liczba = liczba / 10;

            }

        } else {
            System.out.println("wpisano ujemną liczbę");
            wypiszLiczbe();
        }
        int max=stosik.size();
        int i = 0;
        while(i<max){
            int removedItem = stosik.pop();
            System.out.print(removedItem+" ");
            i+=1;
        }
    }
    public static int wczytaj() {
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj liczbe : ");
        return liczba.nextInt();

    }
    public static void Erastenes(){
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        int n=wczytaj();
        for(int i=4; i<=n; i ++){
            primes.add(i);
        }
        for(int a=2; a<Math.sqrt(n); a++) {

            int finalA = a;
            primes.removeIf(prime -> prime % finalA == 0 && prime > finalA);
        }
        System.out.print(primes);
    }
    public static <T extends Iterator<T>> void print(LinkedList a){
        Iterator<T> it = a.iterator();
        while (it.hasNext()){
            Object val = it.next();
            System.out.print(val.toString());
            if(it.hasNext()){
                System.out.print(", ");
            }
            else{
                System.out.println();
            }
        }
    }



}
