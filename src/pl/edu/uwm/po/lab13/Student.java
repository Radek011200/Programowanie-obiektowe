package pl.edu.uwm.po.lab13;

public class Student implements Comparable<Student>{
    public int id;
    public String nazwisko;
    public String imie;
    public Student(int id, String nazwisko,String imie){
        this.id=id;
        this.nazwisko=nazwisko;
        this.imie=imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Student o) {
        if(this.nazwisko.compareTo(o.getNazwisko())<=0){
            if(this.imie.compareTo(o.getImie())<=0){
                if(this.id<o.getId()){
                    return -1;
                }
                else if(this.id==o.getId()){
                    return 0;
                }
                else {
                    return 1;
                }
            }
            return this.imie.compareTo(o.getImie());
        }
        return this.nazwisko.compareTo(o.getNazwisko());
    }
}
