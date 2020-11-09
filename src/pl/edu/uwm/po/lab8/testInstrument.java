package pl.edu.uwm.po.lab8;
import pl.imiajd.Iwanowicz.Flet;
import pl.imiajd.Iwanowicz.Fortepian;
import pl.imiajd.Iwanowicz.Skrzypce;

import java.time.LocalDate;
import java.util.ArrayList;

public class testInstrument {
    public static void main(String[] args){
        ArrayList<Instrument> orkiestra = new ArrayList<>();
        orkiestra.add(new Flet("Flecik", LocalDate.of(2000,1,9)));
        orkiestra.add(new Fortepian("Fortepiano",LocalDate.of(1200,12,1)));
        orkiestra.add(new Skrzypce("Skrzypki",LocalDate.of(1700,5,6)));
        orkiestra.add(new Flet("Flett",LocalDate.of(1900,12,1)));
        orkiestra.add(new Skrzypce("Gitara",LocalDate.of(1700,5,6)));

        for ( Instrument a: orkiestra){
            System.out.print(a.dzwiek()+"\n");
            System.out.println(a);
        }




    }

}
