package pl.edu.uwm.po.lab6;

public class Test_IntegerSet {
    public static void main(String[] args){
        IntegerSet tab1= new IntegerSet();
        IntegerSet tab2 = new IntegerSet();

        tab1.insertElement((5));
        tab1.insertElement((10));
        tab1.insertElement((15));
        tab1.insertElement((20));
        tab1.insertElement((25));
        tab1.insertElement((30));
        tab1.insertElement((35));
        tab1.insertElement((40));

        tab2.insertElement((5));
        tab2.insertElement((10));
        tab2.insertElement((15));
        tab2.insertElement((50));
        tab2.insertElement((55));
        tab2.insertElement((60));
        tab2.insertElement((65));
        tab2.insertElement((70));

        IntegerSet sumaMnogosciowa = IntegerSet.union(tab1,tab2);
        System.out.println(sumaMnogosciowa.toString());
        IntegerSet iloczynMnogosciowy = IntegerSet.intersection(tab1,tab2);
        System.out.println(iloczynMnogosciowy.toString());
        System.out.println(tab1.equals(tab2));
        tab2.deleteElement((50));
        tab2.deleteElement((55));
        tab2.deleteElement((60));
        tab2.deleteElement((65));
        tab2.deleteElement((70));

        tab1.deleteElement((20));
        tab1.deleteElement((25));
        tab1.deleteElement((30));
        tab1.deleteElement((35));
        tab1.deleteElement((40));



        System.out.println(tab1.equals(tab2));
        System.out.println(tab1);
        System.out.println(tab2);



    }
}
