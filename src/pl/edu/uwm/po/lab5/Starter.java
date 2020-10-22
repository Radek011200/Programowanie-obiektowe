package pl.edu.uwm.po.lab5;
import java.util.Arrays;
import java.util.ArrayList;
public class Starter {
    public static void main (String [] args){
        ArrayList<Integer> a= new ArrayList<Integer>();
        ArrayList<Integer> b= new ArrayList<Integer>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);
        Zadanie1.append(a,b);
        System.out.println(a);
        ArrayList<Integer> zad2a= new ArrayList<Integer>();
        ArrayList<Integer> zad2b= new ArrayList<Integer>();
        zad2a.add(1);
        zad2a.add(4);
        zad2a.add(9);
        zad2a.add(16);
        zad2b.add(9);
        zad2b.add(7);
        zad2b.add(4);
        zad2b.add(9);
        zad2b.add(11);
        ArrayList<Integer> zad2odp= new ArrayList<Integer>();
        zad2odp= Zadanie2.merge(zad2a,zad2b);
        System.out.println(zad2odp);
        ArrayList<Integer> zad3odp= new ArrayList<Integer>();
        ArrayList<Integer> zad3a= new ArrayList<Integer>();
        ArrayList<Integer> zad3b= new ArrayList<Integer>();
        zad3a.add(1);
        zad3a.add(4);
        zad3a.add(9);
        zad3a.add(16);
        zad3b.add(9);
        zad3b.add(7);
        zad3b.add(4);
        zad3b.add(9);
        zad3b.add(11);

        zad3odp=Zadanie3.mergeSorted(zad3a,zad3b);
        System.out.println(zad3odp);
        ArrayList<Integer> zad4odp= new ArrayList<Integer>();
        zad4odp=Zadanie4.reversed(zad3odp);
        System.out.println(zad4odp);
        ArrayList<Integer> zad5odp= new ArrayList<Integer>();
        zad5odp=zad4odp;
        Zadanie5.reverse(zad5odp);
        System.out.println(zad5odp);



    }
}
