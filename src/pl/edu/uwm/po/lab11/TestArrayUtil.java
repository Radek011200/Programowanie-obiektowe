package pl.edu.uwm.po.lab11;

public class TestArrayUtil {
    public static void main (String[] args){
        Integer[] asd = {2,3,4,5,6,7};
        Integer[] sda = {2,1,4,5,6,5,4,8,7};


        ArrayUtil.isSorted(asd);
        ArrayUtil.isSorted(sda);

        System.out.println(ArrayUtil.binSearch(asd,7));
    }
}
class ArrayUtil<T extends Comparable> {
    public static <T extends Comparable> void isSorted(T[] a){
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
    public static <T extends Comparable> int binSearch(T[] a, T b){
        for(int i=0; i<a.length; i++){
            if(a[i]==b){
                return i;

            }
        }
        return -1;

    }
    //public static <T extends Comparable>
}
