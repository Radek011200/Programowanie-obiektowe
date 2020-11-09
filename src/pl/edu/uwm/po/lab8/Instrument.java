package pl.edu.uwm.po.lab8;

import java.util.Objects;

public abstract class Instrument {
    private String producent;
    private java.time.LocalDate rokProdukcji;
    public abstract String dzwiek();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instrument that = (Instrument) o;
        return Objects.equals(producent, that.producent) &&
                Objects.equals(rokProdukcji, that.rokProdukcji);
    }
    public Instrument(String producent, java.time.LocalDate rokProdukcji){
        this.producent=producent;
        this.rokProdukcji=rokProdukcji;
    }
    @Override
    public int hashCode() {
        return Objects.hash(producent, rokProdukcji);
    }

    @Override
    public String toString() {
        return "Instrument{" +
                "producent='" + producent + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                '}';
    }
    public String getProducent(){ return this.producent; }
    public java.time.LocalDate getRokProdukcji(){ return  this.rokProdukcji; }


}
