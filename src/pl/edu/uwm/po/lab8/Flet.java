package pl.edu.uwm.po.lab8;

public class Flet extends Instrument{


    public Flet(String producent, java.time.LocalDate rokProdukcji){
        super(producent,rokProdukcji);


    }
    public String dzwiek(){
        return " dźwięk fleta";
    }

}
