
package firstparcialexercises;

/**
 *
 * @author franc
 */
public class Circle1 {
    private double radius;
    private String color;


public Circle1(){
    radius = 1.0;
    color = "red";
}

public Circle1(double radius){
    this.radius = radius;
    this.color = "red";
}

public Circle1(String color){
    this.radius= 1.0;
    this.color = color;
}

public Circle1(double radius, String color){
    this.radius=radius;
    this.color=color;
}

public double getRadius(){
    return this.radius;
}

public String getColor(){
    return this.color;
}
public void setRadius(double radius){
    this.radius = radius;
}

public void setColor(String color){
    this.color = color;
}

@Override
public String toString(){
    String temp;
    temp = "Circle [radius = " + this.radius + ", color = " + this.color + "]" ;
    return temp;
}

public double getArea(){
    return this.radius*this.radius*Math.PI;
}


}