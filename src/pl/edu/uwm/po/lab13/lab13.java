package pl.edu.uwm.po.lab13;
import java.util.*;

public class lab13
{
    public static void main(String[] args)
    {
        PriorityQueue<String> Queue=new PriorityQueue<>();
        Zad1.zad1(Queue);
        TreeMap<String, String>  mapa = new TreeMap<>();
        Zad2.zad2(mapa);
        Zad3 zadanie = new Zad3();
        zadanie.zad3();
    }
}


