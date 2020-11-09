package pl.imiajd.Iwanowicz;

public class Studentlab8 extends Osobalab8 {
    public Studentlab8(String[] imie, String nazwisko,  java.time.LocalDate dataUrodzenia, String kierunek, double sredniaOcen,boolean plec)
    {
        super(imie,nazwisko,dataUrodzenia,plec);
        this.kierunek = kierunek;
        this.sredniaOcen=sredniaOcen;
    }

    public String getOpis()
    {
        return "kierunek studiów: " + kierunek+ ", średnia ocen "+ sredniaOcen  ;
    }
    public double getSredniaOcen()
    {
        return sredniaOcen;
    }

    public void setSredniaOcen(double sredniaOcen) {
        this.sredniaOcen = sredniaOcen;
    }

    private String kierunek;
    private double sredniaOcen;
}
