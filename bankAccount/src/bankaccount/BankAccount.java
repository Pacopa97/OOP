
package bankaccount;

/**
 * @author franc
 */
public class BankAccount { //Se definen las propiedades de la cuenta
    public String name;
    public String accNum;
    public double balance;
    private double deposit;
    private double withdraw;
    
public BankAccount(double balance, String accNum){
    this.balance =balance;
    this.accNum=accNum;
}
    
public BankAccount(){  //Se establecen los valores iniciales de la cuenta
    this(0.00,"Sin numero");
}

public double getBalance(){ //Metodo para obtener el saldo de la cuenta
    return balance;
}

public double setBalance(double balance){
    return this.balance;
}

public String getAccNum(){
    return accNum;
}

public String setAccNum(String accNum){
    return this.accNum;
}

public void deposit(double amount){ //Metodo para hacer un deposito a la cuenta
    this.deposit+= amount;
}

public boolean withdraw(double amount){ //Metodo para hacer un retiro a la cuenta
    if(balance>=amount){
        this.balance-= amount;
        return true;}
    else{
        System.out.println("Insufficient founds");
        return false;
        
              
    }
}


    
}