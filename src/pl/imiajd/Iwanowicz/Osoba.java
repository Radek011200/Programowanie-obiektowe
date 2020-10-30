package pl.imiajd.Iwanowicz;

public class Osoba {

    private String nazwisko="";
    private int rokUrodzenia=0;


    public Osoba(String nazwisko, int rokUrodzenia) {
        this.nazwisko=nazwisko;
        this.rokUrodzenia=rokUrodzenia;
    }

    protected String getNazwisko() {
        return nazwisko;
    }

    protected int getRokUrodzenia() {
        return rokUrodzenia;
    }
}
