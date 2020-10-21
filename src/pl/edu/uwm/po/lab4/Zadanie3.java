package pl.edu.uwm.po.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadanie3 {

    public static void main (String [] args)  {

        int ile = 0;
        try {
            // Tak samo jak w poprzednim zadaniu.
            File myFile = new File("C:\\Users\\bezie\\IdeaProjects\\lab_01\\src\\pl\\edu\\uwm\\po\\lab4\\tekst.txt");
            Scanner myReader = new Scanner(myFile);

            Scanner wyraz = new Scanner(System.in);
            System.out.print("Wprowadź ciąg znaków, aby sprawdzić ile razy wystepują: ");
            String a= String.valueOf(wyraz.next());

            while (myReader.hasNextLine()) {
                String line = myReader.nextLine();
                ile += Zadanie3.slowo(line,a);

            }
            myReader.close();
        } catch (FileNotFoundException e) {

            System.out.printf("Nie ma takiego pliku");
            e.printStackTrace();
        }
        System.out.println("Liczba wystapień znaku/znaków ab: " + ile);
    }
    private static int slowo (String str, String searchedstr){
        int count =0;
        int temp=0;
        for (int i =0; i< str.length(); i++){
            for(int j=0; j<searchedstr.length(); j++){
                if(temp >0 && str.charAt(i+j)!=searchedstr.charAt(j)){
                    temp=0;
                }

                else if( str.length()-i>=searchedstr.length()&&str.charAt(i+j)==searchedstr.charAt(j)){
                    temp+=1;

                    if(temp==searchedstr.length()){
                        count +=1;
                        temp=0;
                    }
                }
            }

        }
        return count;
    }
}
