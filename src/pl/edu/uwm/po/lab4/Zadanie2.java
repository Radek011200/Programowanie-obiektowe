package pl.edu.uwm.po.lab4;
import java.util.Scanner;
import java.io.File;

import java.io.FileNotFoundException;
public class Zadanie2 {

    public static void main (String [] args)  {
        char litera=' ';
        int ile = 0;
        try {
            // Nie chciało mi kompletnie zadziałać, wczytywanie pliku i musialem podać całą ścieżkę.
            File myFile = new File("C:\\Users\\bezie\\IdeaProjects\\lab_01\\src\\pl\\edu\\uwm\\po\\lab4\\tekst.txt");
            Scanner myReader = new Scanner(myFile);
            Scanner wyraz = new Scanner(System.in);
            System.out.print("Wprowadź litere: ");
            litera=wyraz.next().charAt(0);


            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                ile += Zadanie2.countCharsInString(line, litera);

            }
            myReader.close();
        } catch (FileNotFoundException e) {

            System.out.printf("Nie ma takiego pliku");
            e.printStackTrace();
        }
        System.out.println("Liczba wystapien znaku " +litera +": "+ ile);
    }
    private static int countCharsInString (String str, char searchedChar){
        int count =0;
        for (int i =0; i< str.length(); i++){
            if (str.charAt(i) == searchedChar) {
                count++;
            }
        }
        return count;
    }
}
