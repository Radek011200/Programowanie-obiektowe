package pl.imiajd.Iwanowicz;

import java.time.LocalDate;

public class Osobalab10 implements Cloneable, Comparable<Osobalab10> {
    private String nazwisko;
    private LocalDate dataUrodzenia;
    public Osobalab10(String nazwisko, LocalDate dataUrodzenia){
        this.nazwisko=nazwisko;
        this.dataUrodzenia=dataUrodzenia;
    }

    @Override
    public String toString() {
        return "[ "+this.nazwisko +" "+this.dataUrodzenia.toString()+"]";
    }

    @Override
    public boolean equals(Object o) {
           Osobalab10 os= (Osobalab10) o;
           return (os.nazwisko.equals(this.nazwisko) && os.dataUrodzenia.equals(this.dataUrodzenia));
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public LocalDate getDataUrodzenia() {
        return this.dataUrodzenia;
    }

    @Override
    public int compareTo(Osobalab10 o) {
        int compare_n= this.nazwisko.compareTo(o.nazwisko);
        if(compare_n==0){
            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        return compare_n;
    }
}
