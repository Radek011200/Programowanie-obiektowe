package pl.imiajd.Iwanowicz;

public class Pracowniklab8 extends Osobalab8 {
    public Pracowniklab8(String[] imie, String nazwisko, java.time.LocalDate dataUrodzenia, double pobory, java.time.LocalDate dataZatrudnienia, boolean plec)
    {
        super(imie,nazwisko,dataUrodzenia,plec);
        this.pobory = pobory;
        this.dataZatrudnienia=dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }
    public java.time.LocalDate getdataZatrudnienia()
    {
        return dataZatrudnienia;
    }
    public String getOpis()
    {
        return String.format("pracownik z pensją %.2f zł, data zatrudnienia: %s", pobory, dataZatrudnienia);
    }
    private java.time.LocalDate dataZatrudnienia;
    private double pobory;
}
