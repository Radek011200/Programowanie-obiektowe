package pl.edu.uwm.po.lab5;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class Zadanie3 {
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> posortowaneScalone= new ArrayList<Integer>();
        posortowaneScalone=Zadanie2.merge(a,b);
        Collections.sort(posortowaneScalone);

        return posortowaneScalone;
    }
}
