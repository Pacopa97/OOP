package bigbellyburguers;

/**
 *
 * @author franc
 */
public class HealthyBurger extends Hamburger {
    
    public HealthyBurger(String bread, String meat, double price) {
        super(bread, meat, price);
        limAdditions = 6;
    }
    
    @Override
    public void getTotal(){
        System.out.println("This is the healthy burguer: " );
        super.getTotal();
}
}
