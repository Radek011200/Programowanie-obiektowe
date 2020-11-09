package pl.imiajd.Iwanowicz;

import java.time.LocalDate;

public abstract class Osobalab8 {
    private String[] imie;
    private final LocalDate dataUrodzenia;
    private final boolean plec;

    public Osobalab8(String[] imie, String nazwisko, java.time.LocalDate dataUrodzenia, boolean plec)
    {
        this.imie=imie;
        this.nazwisko = nazwisko;
        this.dataUrodzenia=dataUrodzenia;
        this.plec=plec;

    }

    public abstract String getOpis();
    public String[] getImie()
    {
        return imie;
    }
    public java.time.LocalDate getdataUrodzenia()
    {
        return dataUrodzenia;
    }
    public String getNazwisko()
    {
        return nazwisko;
    }

    private String nazwisko;
    public boolean getPlec(){

        return plec;
    }

}
