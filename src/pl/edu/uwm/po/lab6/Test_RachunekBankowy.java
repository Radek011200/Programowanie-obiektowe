package pl.edu.uwm.po.lab6;

import com.sun.source.util.SourcePositions;

import java.sql.SQLOutput;

public class Test_RachunekBankowy {
    public static void main(String[] args) {

        RachunekBankowy konto1 = new RachunekBankowy(5000,5);
        RachunekBankowy konto2 = new RachunekBankowy(6000,5);
        konto1.obliczMiesieczneOdsetki();
        konto2.obliczMiesieczneOdsetki();
        System.out.printf("Saldo konta1: %f\n",konto1.getSaldo());
        System.out.printf("Saldo konta2: %f\n",konto2.getSaldo());
        konto1.setRocznaStopaProcentowa(6);
        konto2.setRocznaStopaProcentowa(6);
        System.out.println("Zmiana rocznej stopy procentowej na 6%");
        konto1.obliczMiesieczneOdsetki();
        konto2.obliczMiesieczneOdsetki();
        System.out.printf("Saldo konto 1: %f\n",konto1.getSaldo());
        System.out.printf("Saldo konto 2: %f\n",konto2.getSaldo());




    }
}
