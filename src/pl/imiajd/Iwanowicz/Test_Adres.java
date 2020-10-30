package pl.imiajd.Iwanowicz;

import pl.edu.uwm.po.lab7.Adres;

public class Test_Adres {
    public static void main(String[] args){
        pl.edu.uwm.po.lab7.Adres ad1 = new pl.edu.uwm.po.lab7.Adres("Kwiatowa", 55, 20, "Ostroleka", 42000);
        pl.edu.uwm.po.lab7.Adres ad2 = new Adres("Hallera", 55, "Olsztyn", 50000);
        ad1.pokaz();
        ad2.pokaz();
        ad1.przed(2000);

    }
}
