
package bankaccount;

/**
 * @author franc
 */
public class BankAccount {
    public String name;
    public int accNum;
    public double balance;
    private double deposit;
    private double withdraw;
    
public BankAccount(){
    name = "Francisco Piñeiro";
    accNum= 0001;
    balance= 1500.25;
}

public double deposit(){
    return this.deposit;
}

public double withdraw(){
    return this.withdraw;
}

public double balance(){
    return this.balance;
}
    
}