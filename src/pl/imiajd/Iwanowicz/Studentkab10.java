package pl.imiajd.Iwanowicz;

import java.time.LocalDate;

public class Studentkab10 extends Osobalab10 implements Cloneable, Comparable<Osobalab10>{
    private double sredniaocen;
    public Studentkab10(String nazwisko, LocalDate dataUrodzenia, double sredniaocen) {
        super(nazwisko, dataUrodzenia);
        this.sredniaocen=sredniaocen;
    }

    @Override
    public String toString() {
        return "[ "+this.getNazwisko() +" "+this.getDataUrodzenia().toString()+" "+ this.sredniaocen +"]";
    }

    @Override
    public int compareTo(Osobalab10 o) {
        int os = super.compareTo(o);
        if(os==0){
            return (int)Math.ceil(this.sredniaocen-((Studentkab10)o).sredniaocen);

        }
        return os;
    }
}
