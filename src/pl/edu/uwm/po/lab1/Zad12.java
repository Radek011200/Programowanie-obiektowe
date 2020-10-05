package pl.edu.uwm.po.lab1;

public class Zad12 {
    public static void main(String[] args) {
        for (int i=1; i<11; i++)
        {
          for (int j=1; j<50; j++)
          {
          if(j<25 && i<6)
              System.out.print("*");

          if(j>24 && i<6)
              System.out.print("=");
          if(i>5)
              System.out.print("=");
          }

            System.out.println();
        }
    }
}
