package bigbellyburguers;

/**
 *
 * @author franc
 */
public class DeluxeBurger extends Hamburger{
    
    public DeluxeBurger(String bread, String meat, double price, Ingredient additions1, Ingredient additions2) {
        super(bread, meat, price);
        limAdditions=2;
        this.setAddition(additions1);
        this.setAddition(additions2);
    }
    
    
    public DeluxeBurger(String bread, String meat, double price, String name1, double price1, String name2, double price2){
        super(bread,meat,price);
        this.setAddition(name1,price1);
        this.setAddition(name2,price2);
    }
    
    
    
    @Override
    public void getTotal(){
        System.out.println("This is a Deluxe Burger: ");
        super.getTotal();
    }
    
}
