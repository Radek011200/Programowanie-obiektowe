package pl.edu.uwm.po.lab10;

import pl.imiajd.Iwanowicz.Osobalab10;
import pl.imiajd.Iwanowicz.Studentkab10;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class TestOsoba {
    public static void main(String[] args) throws FileNotFoundException {


    Osobalab10[] grupa = new Osobalab10[5];
    grupa[0]=new Osobalab10("Iwanowicz",LocalDate.of(2000,12,1));
    grupa[1]=new Osobalab10("Nowak",LocalDate.of(1999,11,2));
    grupa[2]=new Osobalab10("Nowak",LocalDate.of(1950,5,20));
    grupa[3]=new Osobalab10("asd",LocalDate.of(1970,10,5));
    grupa[4]=new Osobalab10("dfgh",LocalDate.of(1995,3,10));
    ArrayList<Osobalab10> lista= new ArrayList<>(5);
    lista.add(grupa[0]);
    lista.add(grupa[1]);
    lista.add(grupa[2]);
    lista.add(grupa[3]);
    lista.add(grupa[4]);
    System.out.println(lista);
    Collections.sort(lista);
    System.out.println(lista);
    //zad2
    ArrayList<Osobalab10> listazad2=new ArrayList<>(5);
    Osobalab10[] grupa2 = new Osobalab10[5];
    grupa2[0]=new Studentkab10("Iwanowicz",LocalDate.of(2000,12,1),3.5);
    grupa2[1]=new Studentkab10("Nowak",LocalDate.of(1999,11,2),4.5);
    grupa2[2]=new Studentkab10("Nowak",LocalDate.of(1950,5,20),5.0);
    grupa2[3]=new Studentkab10("asd",LocalDate.of(1970,10,5),3.0);
    grupa2[4]=new Studentkab10("dfgh",LocalDate.of(1995,3,10),4.0);
    listazad2.add(grupa2[0]);
    listazad2.add(grupa2[1]);
    listazad2.add(grupa2[2]);
    listazad2.add(grupa2[3]);
    listazad2.add(grupa2[4]);
    System.out.println(listazad2);
    Collections.sort(lista);
    System.out.println(listazad2);

    ArrayList<String> Zadanie3= new ArrayList<>();
    try {

        File myFile = new File("C:\\Users\\bezie\\IdeaProjects\\lab_01\\src\\pl\\edu\\uwm\\po\\lab10\\tekst.txt");
        Scanner myReader = new Scanner(myFile);
        while (myReader.hasNextLine()) {

            Zadanie3.add(myReader.nextLine());
        }

        myReader.close();
    } catch (FileNotFoundException e) {
        System.out.printf("Nie ma takiego pliku");
        e.printStackTrace();
        }
        System.out.println(Zadanie3);
        Collections.sort(Zadanie3);
        System.out.println(Zadanie3);

    }
}
