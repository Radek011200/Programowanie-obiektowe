package pl.edu.uwm.po.lab8;

public class Skrzypce extends Instrument{

    @Override
    public String dzwiek() {
        return "dżwięk Skrzypiec";
    }
    public Skrzypce(String producent, java.time.LocalDate rokProdukcji){
        super(producent,rokProdukcji);
    }
}
