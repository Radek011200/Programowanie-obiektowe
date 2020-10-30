package pl.imiajd.Iwanowicz;

public class Test_Osoba {
    public static void main(String[] args){
        Osoba os1 = new Nauczyciel("Mickiewicz",1919,5000);
        Osoba os2 = new Student("Krasicki",1920,"Informatyka");
        Osoba os3 = new Osoba("Tuwim",1921);
        System.out.println(os1.toString());
        System.out.println(os2.toString());

    }
}
