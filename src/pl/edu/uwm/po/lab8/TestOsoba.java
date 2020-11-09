package pl.edu.uwm.po.lab8;

import pl.imiajd.Iwanowicz.Osobalab8;
import pl.imiajd.Iwanowicz.Pracowniklab8;
import pl.imiajd.Iwanowicz.Studentlab8;

import java.time.LocalDate;

public class TestOsoba {
    public static void main(String[] args) {
        Osobalab8[] ludzie = new Osobalab8[2];

        ludzie[0] = new Pracowniklab8(new String[]{"Jan"}, "Kowalski", LocalDate.of(2019, 5, 25), 1999, LocalDate.of(2020, 2, 5), false);
        ludzie[1] = new Studentlab8(new String[]{"Małgorzata", "Małgosia"}, "Nowak", LocalDate.of(1999, 12, 2), "Informatyka", 5.4, true);
        // ludzie[2] = new Osoba("Dyl Sowizdrzał");

        for (Osobalab8 p : ludzie) {
            for ( String imie : p.getImie()){
                System.out.print(imie+" ");
            }
            System.out.print(p.getNazwisko() + ": "+ p.getOpis() + " płec: ");
            if (p.getPlec()) {
                System.out.print("Kobieta, urodzona: ");
            } else {
                System.out.print("Mężczyzna, urodzony: ");
            }
            System.out.println(p.getdataUrodzenia());
        }
    }
}

//abstract class Osoba
//{

//}

//class Pracownik extends Osoba
//{

//}


//class Student extends Osoba
//{

//}


