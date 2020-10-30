package pl.imiajd.Iwanowicz;

public class Student extends Osoba {
    private String kierunek = "";
    public Student(String nazwisko, int rokUrodzenia, String kierunek){
        super(nazwisko,rokUrodzenia);
        this.kierunek=kierunek;
    }

    @Override
    public String toString() {
        return "Student " + getNazwisko()+
                " na kierunku " + kierunek + " urodzony w " + getRokUrodzenia();
    }
}
