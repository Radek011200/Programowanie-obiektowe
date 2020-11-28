package pl.edu.uwm.po.lab11;

public class Pair<T> {




    public Pair() {
        first = null;
        second = null;
    }

    public Pair (T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T temp=null;
    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public void setFirst (T newValue) {
        first = newValue;
    }
    public void setSecond (T newValue) {
        second = newValue;
    }

    private T first;
    private T second;
    public <T> void swap (T first, T second){

        temp=this.second;
        setSecond(getFirst());
        setFirst(temp);


    }

}

