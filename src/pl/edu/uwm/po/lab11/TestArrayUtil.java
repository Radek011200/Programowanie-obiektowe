package pl.edu.uwm.po.lab11;
import java.time.LocalDate;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;

public class TestArrayUtil {
    public static void main (String[] args){
        Integer[] asd = {2,3,4,5,6,7};
        Integer[] sda = {2,1,4,5,6,5,4,8,7};
        GregorianCalendar[] data1 = {
                new GregorianCalendar (1906, Calendar.DECEMBER, 9),
                new GregorianCalendar (1907, Calendar.DECEMBER, 10),
                new GregorianCalendar (1908, Calendar.DECEMBER, 3),
                new GregorianCalendar (1910, Calendar.JUNE, 22),
        };

        ArrayUtil.isSorted(asd);
        ArrayUtil.isSorted(sda);
        ArrayUtil.isSorted(data1);
        System.out.println(ArrayUtil.binSearch(asd,7));
        System.out.println(ArrayUtil.binSearch(data1,data1[1]));
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(1);
        a.add(3);
        ArrayList<LocalDate> data = new ArrayList<>();
        data.add(LocalDate.of(2000,12,1));
        data.add(LocalDate.of(1999,6,5));
        data.add(LocalDate.of(2001,12,6));
        ArrayUtil.selectionSort(data);
        System.out.println(data);
        ArrayUtil.selectionSort(a);
        System.out.println(a);


    }
}
class ArrayUtil {
    public static <T extends Comparable<? super T>> void isSorted(T[] a){
        if(a == null || a.length == 0) System.out.println("Tablica ma 0 elementow");
        T min = a[0];
        T max = a[0];
        int temp=0;

        for(int i=1; i< a.length; i++){

            if(min.compareTo(a[i]) > 0 ) {
                min = a[i];

            }
            if (max.compareTo(a[i]) < 0 ){
                max = a[i];
                temp+=1;
                
            }
        }
        if(temp== a.length-1){
            System.out.println("Tablica jest posortowana");

        }
        else{
            System.out.println("Tablica nie jest posortowana");
        }



    }
    public static <T extends Comparable<? super T>> int binSearch(T[] a, T b){
        for(int i=0; i<a.length; i++){
            if(a[i]==b){
                return i;

            }
        }
        return -1;

    }
    public static <T extends Comparable<? super T>> void selectionSort(ArrayList<T> a){
        int max;
        T temp;
        for( int i =a.size()-1; i>=0; i--){
            max=0;
            for (int j=0; j<=i; j++){
                if (a.get(max).compareTo(a.get(j))<0){
                    max=j;
                }
            }
            if (max!=i){
                temp=a.get(i);
                a.set(i,a.get(max));
                a.set(max,temp);

            }
        }


    }
}
