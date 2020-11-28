package pl.edu.uwm.po.lab11;
//import pl.edu.uwm.po.lab11.Pair;
class PairUtil<T> extends Pair{
    public T Pair;
    public T temp=null;
    public PairUtil(){
        T Pair= null;
    }
    public PairUtil(T Pair){
        this.Pair=Pair;
    }


    public void swap(Pair<T> para){
        temp=para.getSecond();
        para.setFirst(para.getSecond());
        para.setSecond(temp);

    }
}