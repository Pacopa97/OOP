
package firstparcialexercises;

/**
 *
 * @author franc
 */
public class Circle {
    
    private double radius;
    
public Circle(){
    radius=1.0;
}

public Circle(double radius){
    this.radius = radius;
}

public double getRadius(){
    return this.radius;
}

public void setRadius(double radius){
    this.radius = radius;
}

public double getArea(){
    return Math.PI*Math.pow(radius, 2);
}
public double getCircumference(){
    return Math.PI*(radius*2);
}

@Override
public String toString(){
    return "Circle [ radius= " + this.radius+"]";
}
    
}
