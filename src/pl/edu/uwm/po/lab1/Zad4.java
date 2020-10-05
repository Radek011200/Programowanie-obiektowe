package pl.edu.uwm.po.lab1;

public class Zad4 {
    public static void main(String[] args) {
        double StanKonta = 1000;
        for (int i = 1; i < 4; i++) {
            StanKonta = StanKonta + StanKonta * 0.06;
            System.out.println("Stan konta po "+i+" roku : "+StanKonta);
        }
    }
}