package firstparcialexercises;

/**
 *
 * @author franc
 */
public class MyPoint {
    private int x;
    private int y;
    
    public MyPoint(int x,int y){
        this.x=x;
        this.y=y;
    }
    
public int getX(){
    return x;
}

public int getY(){
    return y;
}

public void setX(int x){
    this.x=x;
}

public void setY(int y){
    this.y=y;
}

public int[] getXY(){
    int[] XY= new int[2];
    XY[0]=this.x;
    XY[1]=this.y;
    return XY;
}

public void XY(int x, int y){
 this.x=x;
 this.y=y;
}

@Override
public String toString(){
    return "("+this.x+","+this.y+")";
}
public double distance(int x, int y){
        double dis;
        dis = Math.sqrt(Math.pow((this.x-x), 2)+Math.pow((this.y-y), 2));
        return dis;
    }
    public double distance(MyPoint another){
        double dis;
        dis = Math.sqrt(Math.pow((this.x-another.x), 2)+Math.pow((this.y-another.y), 2));
        return dis;
    }
    public double distance(){
        double dis;
        dis = Math.sqrt(Math.pow((this.x), 2)+Math.pow((this.y), 2));
        return dis;
    }

    void setXY(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
