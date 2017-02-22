package firstparcialexercises;

/**
 *
 * @author franc
 */
public class MyCircle {
    private MyPoint center;
    private int radius;
    
public MyCircle(){
    this.center= new MyPoint (0,0);
    this.radius= 1;
}

 public MyCircle(int x, int y, int radius){
        this.center.setXY(x,y);
        this.radius=radius;
 }

   public MyCircle(MyPoint center, int radius){
        this.center=center;
        this.radius=radius;
    }
    public int getRadius() {
        return radius;
    }
    
    public void setRadius(int radius) {
        this.radius = radius;
    }
    
    public MyPoint getCenter() {
        return center;
    }
    
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    
    public int getCenterX(){
        return this.center.getX();
    }
    
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return this.center.getY();
    }
    
    public void setCenterY(int y){
        this.center.setY(y);
    }
    
    public int[] getCenterXY(){
        return this.center.getXY();
    }
    
    @Override
    public String toString(){
        return "MyCircle[radius="+this.radius+",center="+this.center+"]";
    }
    
    public double getArea(){
        return Math.PI*Math.pow(this.radius, 2);
    }
    
    public double getCircumference(){
        return 2*Math.PI*this.radius;
    }
    
    public double distance(MyCircle another){
        return center.distance(another.center);
    }
    
}
