package pl.imiajd.Iwanowicz;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private int kod_pocztowy;
    public Adres(){
        this.ulica="";
        this.numer_domu=0;
        this.numer_mieszkania=0;
        this.miasto="";
        this.kod_pocztowy=0;
    }
    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, int kod_pocztowy){
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.numer_mieszkania=numer_mieszkania;
        this.miasto=miasto;
        this.kod_pocztowy=kod_pocztowy;
    }
    public Adres(String ulica, int numer_domu, String miasto, int kod_pocztowy){
        this.ulica=ulica;
        this.numer_domu=numer_domu;
        this.miasto=miasto;
        this.kod_pocztowy=kod_pocztowy;
    }
    public void pokaz(){
        if (numer_mieszkania >0){
            System.out.printf("Kod pocztowy : "+ kod_pocztowy +", miasto "+ miasto+"\n Ulica: "+ ulica+", numer domu: "+ numer_domu+", numer mieszkania: "+numer_mieszkania+"\n");
        }
        else
            System.out.printf("Kod pocztowy : "+ kod_pocztowy +", miasto "+ miasto+"\n Ulica: "+ ulica+", numer domu: "+ numer_domu+"\n");

    }
    public boolean przed(int kod){

        System.out.println(kod_pocztowy>kod);


        return false;
    }
}
