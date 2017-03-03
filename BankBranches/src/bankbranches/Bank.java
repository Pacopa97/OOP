package bankbranches;

import java.util.ArrayList;

/**
 *
 * @author franc
 */
public class Bank {
    private ArrayList<Branch> branches;

    public Bank(){
        this.branches = new ArrayList();
    }
 
    public boolean addBranch(String name){
        int n;
        n = findBranch(name);
        
        if(n==-1){
            this.branches.add(new Branch(name));
            System.out.println("Branch added");
            return true;
        }else{
            System.out.println("Branch already exists");
            return false;
        }   
    }
    
    public boolean addCustomer(String bName, String cName, double amount){
        int i = findBranch(bName);
        if(i==-1){
            System.out.println("Branch doesn't exist");
            return false;
        }
        if(this.branches.get(i).addCustomer(cName, amount)){
        System.out.println("Customer added to: "+bName+"!");
        return true;
        }
        return false;
    }
    public boolean addTransaction(String bName, String cName, double amount){
        int i = findBranch(bName);
        if(i==-1){
            System.out.println("Branch doesn't exist");
            return false;
        }
        if(this.branches.get(i).addTransaction(cName, amount)){
        System.out.println("Transaction added to "+cName+" at "+bName+" branch");
        return true;
        }
        return false;
    }
    public boolean getTransactions(String bName, String cName){
        int i = findBranch(bName);
        if(i==-1){
            System.out.println(cName+" doesn't exist");
            return false;
        }
        if(this.branches.get(i).findCustomer(cName)!=-1){
            System.out.println("Customer "+cName+" transactions at "+bName+" are:");
            for(double temp : this.branches.get(i).getTransactions(cName)){
                System.out.println(temp);
            }
            return true;
        }
        System.out.println(cName+" doesn't exist in "+bName);
        return false;
    }
    public void getCustomers(String bName){
        int n = findBranch(bName);
        if(n == -1){
            System.out.println("Branch doesn't exists");
        }
        System.out.println("Customers at branch "+bName);
        for(Customer temp : this.branches.get(n).getCustomers()){
            System.out.println(temp.getName());
        }
    }
        public boolean getCustomersWithTransactions(String bName){
        int n;
        n =findBranch(bName);
        if(n ==-1){
            System.out.println("Branch doesn't exists");
            return false;
        }
        for(Customer temp : this.branches.get(n).getCustomers()){
            getTransactions(bName, temp.getName());
        }
        return true;
    }
    public int findBranch(String name){
        for(Branch temp : this.branches){
            if(temp.getName().equalsIgnoreCase(name)){
                return branches.indexOf(temp);
            }
        }
        return -1;
    } 
}
