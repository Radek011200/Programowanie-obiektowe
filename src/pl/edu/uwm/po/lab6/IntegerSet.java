package pl.edu.uwm.po.lab6;
import javax.swing.*;
import java.util.Arrays;
public class IntegerSet {
    private final boolean[] tablica;

    public IntegerSet(){
        this.tablica= new boolean[100];
        Arrays.fill(this.tablica, false);
    }
    public static IntegerSet union(IntegerSet a, IntegerSet b){
        IntegerSet suma= new IntegerSet();
        for(int i=0; i<100; i++){
            if(a.tablica[i] || b.tablica[i]){
                suma.tablica[i]=true;
            }
        }return suma;

    }
    public static IntegerSet intersection(IntegerSet a, IntegerSet b){
        IntegerSet suma = new IntegerSet();
        for(int i=0; i<100; i++){
            if(a.tablica[i] && b.tablica[i]){
                suma.tablica[i]=true;
            }
        }return suma;
    }
    public void insertElement(int liczba){
        if(liczba>=0 && liczba<100){
            this.tablica[liczba-1] = true;
        }

    }
    public void deleteElement(int liczba){
        if(liczba>=0 && liczba<100){
            this.tablica[liczba-1]=false;
        }

    }
    public String toString(){
        String suma ="";
        for(int i=0; i<100; i++){
            if(this.tablica[i]){
                suma += (i+1)+ " ";
            }
        }return suma;
    }
    public boolean equals(IntegerSet a){
        if(this.toString().equals(a.toString())) {
            return true;
        }
        else {
            return false;
        }
    }
}
