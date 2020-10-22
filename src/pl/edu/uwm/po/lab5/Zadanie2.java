package pl.edu.uwm.po.lab5;
import java.util.Arrays;
import java.util.ArrayList;


public class Zadanie2 {
    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer>temp=new ArrayList<Integer>();


        for (int i =0; i<(a.size()+b.size()); i++){
            if(a.size()>i){
                temp.add(a.get(i));
            }
            if(b.size()>i){
                temp.add(b.get(i));
            }

        }return temp;
    }
}
