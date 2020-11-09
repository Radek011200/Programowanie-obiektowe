package pl.edu.uwm.po.lab8;

public class Fortepian extends Instrument{
    @Override
    public String dzwiek() {
        return "dzwiek fortepianu";
    }

    public Fortepian(String producent, java.time.LocalDate rokProdukcji){
        super(producent,rokProdukcji);


    }
}
