package firstparcialexercises;

/**
 *
 * @author franc
 */
public class FirstParcialExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      MyRectangle1 rectangle = new MyRectangle1(2,6,6,2);  //topLeft(1,7) bottomRight(4,2)
      System.out.println(rectangle);  
      System.out.println("Area is " + rectangle.getArea());  
      System.out.println("Perimeter is " + rectangle.getPerimeter()); 
    }
    
}
