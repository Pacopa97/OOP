package bigbellyburguers;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Hamburger {
    private String bread;
    private String meat;
    private double price;
    protected int limAdditions;
    private ArrayList<Ingredient>  additions = new ArrayList<Ingredient>();
    
    
public Hamburger(String bread,String meat, double price){
    this.bread=bread;
    this.meat=meat;
    this.price=price;
    this.limAdditions=4;
       
}

public boolean setAddition(Ingredient addition){
    if(additions.size() < this.limAdditions){
    return this.additions.add(addition);
    }else{
        System.out.println("Limit exceeded");
        return false;
    }
}

public boolean setAddition(String name, double price){
    if(additions.size() < this.limAdditions){
        
    return this.additions.add(new Ingredient(name,price));
    }else{
        System.out.println("Limit exceeded");
        return false;
    }
        }

public void getTotal(){
    double total=0;
    System.out.println("This is a "+ this.meat+" burguer in "+ this.bread+" with the base price of: "+ this.price);
    
    total += this.price;
    
    for(Ingredient tempIngredient : this.additions){
        System.out.println("with "+ tempIngredient.getName() + " at "+ tempIngredient.getPrice());
        
        total += tempIngredient.getPrice();
    }
    
}




    
}
