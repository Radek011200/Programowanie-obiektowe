package pl.edu.uwm.po.lab5;
import java.util.Arrays;
import java.util.ArrayList;
public class Zadanie5 {
    public static void reverse(ArrayList<Integer> a){
        ArrayList<Integer>temp=new ArrayList<>(a);
        a.clear();
        for(int i= temp.size()-1; i>=0; i--){
        a.add(temp.get(i));
        }
    }
}
