package pl.edu.uwm.po.lab5;
import java.util.Arrays;
import java.util.ArrayList;
public class Zadanie4 {
    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
    ArrayList<Integer> odwrocona = new ArrayList<Integer>();
    for(int i= a.size()-1; i>=0; i--){
        odwrocona.add(a.get(i));
    }return odwrocona;
    }
}
