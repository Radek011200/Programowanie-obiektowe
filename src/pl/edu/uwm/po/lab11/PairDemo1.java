package pl.edu.uwm.po.lab11;
import pl.edu.uwm.po.lab11.Pair;
public class PairDemo1 {

    public static void main(String[] args)
    {
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        //mm.swap(mm.getFirst(), mm.getSecond());
        Pair<String> mma = ArrayAlg.minmax(words);

        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        PairUtil<String> mmm = (PairUtil<String>) ArrayAlg.minmax(words);
        //mma.swap(mma.getFirst(),mma.getSecond());


    }
}

class ArrayAlg {

    public static Pair<String> minmax(String[] a)
    {
        if (a == null || a.length == 0) {
            return null;
        }

        String min = a[0];
        String max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }

            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }

        return new Pair<String> (min, max);
    }
}


