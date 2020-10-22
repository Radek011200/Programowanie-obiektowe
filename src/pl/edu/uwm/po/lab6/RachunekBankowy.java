package pl.edu.uwm.po.lab6;

public class RachunekBankowy {
    double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(){
        this.saldo=0;
        this.rocznaStopaProcentowa = 0;
    }

    public RachunekBankowy(double saldo, double rocznaStopaProcentowa){
        this.saldo=saldo;
        this.rocznaStopaProcentowa= rocznaStopaProcentowa;
    }
    public void obliczMiesieczneOdsetki(){
        this.saldo += (saldo*rocznaStopaProcentowa)/12;
    }

    public void setRocznaStopaProcentowa(double rocznaStopaProcentowa) {
        this.rocznaStopaProcentowa = rocznaStopaProcentowa;
    }
    public double getSaldo(){
        return saldo;
    }
}
