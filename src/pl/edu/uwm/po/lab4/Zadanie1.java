package pl.edu.uwm.po.lab4;
import java.util.Arrays;
import java.util.ArrayList;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

class Zadanie1 {


    public String wczytaj() {
        Scanner liczba = new Scanner(System.in);
        System.out.print("Napisz slowo: ");
        return liczba.next();

    }
    public int countChar(String str, char c){
        int suma=0;
        char temp='a';
        String wyraz = wczytaj();
        for( int i=0; i<wyraz.length(); i++){
            temp = wyraz.charAt(i);
            if(temp==c){
                suma+=1;
            }

        }return suma;
    }
    public int countSubStr(String str, String subStr){
        int suma=0;
        int suman=0;
        str=wczytaj();
        subStr=wczytaj();
        for(int i=0; i<str.length(); i++){
            for(int j=0; j<subStr.length(); j++){
                if(str.charAt(i)==subStr.charAt(0)){
                    if(i+j>str.length()){}
                    else if(str.charAt(i+j)==subStr.charAt(j)){
                        suman+=1;
                        if(suman==subStr.length()) {
                            suma += 1;
                            suman=0;
                        }

                    }
                }
            }

        }return suma;

    }
    public String middle(String str){
        str=wczytaj();
        String a="";

        if(str.length()%2!=0){
           a="" + str.charAt(str.length()/2);
        }
        else{
            a="" +str.charAt(str.length()/2-1) + str.charAt(str.length()/2);

        }return a;
    }
    public String repeat(String str, int n){
        str=wczytaj();
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj liczbe kopii dla slowa");
        n=liczba.nextInt();
        String a="";
        for(int i=0; i<n; i++){
            a+="" + str;
        }return a;
    }
    public int[] where(String str, String subStr){
        int [] indexes = new int[str.length()];
        int suman=0;
        int k =0;
        str=wczytaj();
        subStr=wczytaj();
        for(int i =0; i<str.length(); i++){
            for(int j=0; j<subStr.length(); j++){
                if(str.charAt(i)==subStr.charAt(0)){
                    if(i+j>str.length()){}
                    else if(str.charAt(i+j)==subStr.charAt(j)){
                        suman+=1;
                        if(suman==subStr.length()) {

                            indexes[k] = i;
                            suman=0;
                            k++;
                        }

                    }
                }
            }

        }return indexes;

    }
    public ArrayList<Integer> where2(String str, String subStr){
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        int suman=0;
        int k =0;
        str=wczytaj();
        subStr=wczytaj();
        for(int i =0; i<str.length(); i++){
            for(int j=0; j<subStr.length(); j++){
                if(str.charAt(i)==subStr.charAt(0)){
                    if(i+j>str.length()){}
                    else if(str.charAt(i+j)==subStr.charAt(j)){
                        suman+=1;
                        if(suman==subStr.length()) {

                            indexes.add(i);
                            suman=0;
                            k++;
                        }

                    }
                }
            }

        }return indexes;

    }
    public String change(String str){
        str=wczytaj();
        StringBuffer wyraz= new StringBuffer();
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                wyraz.append(Character.toLowerCase(str.charAt(i)));
            }
            else{
                wyraz.append(Character.toUpperCase(str.charAt(i)));
            }
        }
        return wyraz.toString();

    }
    public String nice(String str){
        str=wczytaj();
        StringBuffer wyraz=new StringBuffer();
        for(int i =0; i<str.length(); i++){
            if(str.length()%3==0){
                if((i)%3==0){
                    wyraz.append("'");
                }
                wyraz.append(str.charAt(i));
                if(i==str.length()-1){
                    wyraz.append("'");
                }

            }
            else if(str.length()%2==0){
                if((i-1)%3==0 ){
                    wyraz.append("'");
                }
                wyraz.append(str.charAt(i));
                if(i==str.length()-1){
                    wyraz.append("'");
                }
            }
            else if(str.length()%2!=0 && str.length()%3!=0){
                if((i-2)%3==0){
                    wyraz.append("'");
                }
                wyraz.append(str.charAt(i));
                if(i==str.length()-1){
                    wyraz.append("'");
                }
            }
        }return wyraz.toString();
    }

    public String nice(String str,int n){
        str=wczytaj();
        Scanner liczba = new Scanner(System.in);
        System.out.print("co ile liter ma sie pojawiac apostrof?");
        n=liczba.nextInt();
        StringBuffer wyraz=new StringBuffer();
        StringBuffer temp=new StringBuffer();
        int licznik=1;
        for(int i =str.length()-1; i>=0; i--){
            if((licznik)%n==0 || i==str.length()-1){
                wyraz.append("'");


            }
            licznik++;
            wyraz.append(str.charAt(i));


            }
        for(int j=wyraz.length()-1; j>=0; j--){
            temp.append(wyraz.charAt(j));
        }

        return temp.toString();



    }

    public void wypisz(){
        //int a=countChar("",'c');
        //System.out.printf(("litera c wystapia: %d razy\n"),a);
        //int b=countSubStr("","");
        //System.out.printf(("wyraz podany jako drugi wystepuje %d razy w pierwszym\n"),b);
        //String c=middle("");
        //System.out.printf(("odp do pkt c) %s"),c);
        //String d=repeat("",1);
        //System.out.printf(("odpowiedz do pkt d: %s"),d);
        //int [] e = Arrays.toString(where("",""));
        //System.out.printf("%s",(where2("","")));
        //System.out.printf("Indeksy wystapien ciagu znakow '%s': %s",ciag2, Arrays.toString(where(ciag,ciag2)));
        //System.out.printf(("%s"),where2());
        //System.out.printf(("%s"),change(""));
        //System.out.printf(("%s"),nice(""));
        //System.out.printf(("%s"),nice("", 5));

    }
}
