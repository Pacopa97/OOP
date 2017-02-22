package firstparcialexercises;

/**
 *
 * @author franc
 */
public class MyRectangle1 {
    private MyPoint topLeft; 
    private MyPoint bottomRight;
   
    public MyRectangle1(int x1, int y1, int x2, int y2){ 
        topLeft = new MyPoint(x1,y1); 
        bottomRight = new MyPoint(x2,y2);
    }
    
    public MyRectangle1(MyPoint topLeft, MyPoint bottomRight){ 
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    
    @Override 
    public String toString(){ 
        return "MyRectangle[ topleft = " + topLeft + ",bottomRight = " + bottomRight + "]";
    }
    
    public double getArea(){ 
        return ((Math.abs(topLeft.getX()-bottomRight.getX()))*(Math.abs(topLeft.getY()-bottomRight.getY())));
    }
    
    public double getPerimeter(){ 
        return (Math.abs(topLeft.getX()-bottomRight.getX())+Math.abs(topLeft.getY()-bottomRight.getY()))*2;
    }
}
