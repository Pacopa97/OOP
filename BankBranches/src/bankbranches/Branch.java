package bankbranches;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Branch {
    private ArrayList<Customer> customers;
    private String name;
  
public Branch(String name){
        this.name= name;
        this.customers = new ArrayList();
    }
    public boolean addCustomer(String name, double amount){
        int n = findCustomer(name);
        if(n == -1){
            System.out.println("Customer already exists");
            return false;
        }
        this.customers.add(new Customer(name,amount));
        return true;
    }
    public String getName() {
        return name;
    }
    public boolean addTransaction(String name, double amount){
        int n;
        n = findCustomer(name);
        if(n == -1){
            System.out.println("Customer doesn't exist");
            return false;
        }
        this.customers.get(n).addTransaction(amount);
        return true;
    }
    public ArrayList<Double> getTransactions(String name) {
        int n = findCustomer(name);
        if(n == -1){
            System.out.println("Customer doesn't exist");
            return null;
        }
        return this.customers.get(n).getTransactions();
    }

    public ArrayList<Customer> getCustomers() {
        if(this.customers.isEmpty()) System.out.println("There are no customers in this branch");
        return customers;
    }
    public int findCustomer(String name){
        for(Customer temp : this.customers){
            if(temp.getName().equalsIgnoreCase(name)){
                return customers.indexOf(temp);
            }
        }
        return -1;
    }
    
    
}
