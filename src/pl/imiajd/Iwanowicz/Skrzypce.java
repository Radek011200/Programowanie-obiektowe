package pl.imiajd.Iwanowicz;

import pl.edu.uwm.po.lab8.Instrument;

public class Skrzypce extends Instrument {

    @Override
    public String dzwiek() {
        return "dżwięk Skrzypiec";
    }
    public Skrzypce(String producent, java.time.LocalDate rokProdukcji){
        super(producent,rokProdukcji);
    }
}
