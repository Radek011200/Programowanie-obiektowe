package pl.imiajd.Iwanowicz;
import java.awt.*;

public class BetterRectangle extends Rectangle{


    public BetterRectangle(int width, int height) {
        super(0,0,width, height);
        super.setSize(width, height);
        super.setLocation(x,y);


    }
    public int getPerimeter(){
        return 2*super.width+2*super.height;
    }
    public int getArea(){
        return super.width*super.height;
    }

}
