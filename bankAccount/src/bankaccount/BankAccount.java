
package bankaccount;

/**
 * @author franc
 */
public class BankAccount { //Se definen las propiedades de la cuenta
    public String name;
    public int accNum;
    public double balance;
    private double deposit;
    private double withdraw;
    
public BankAccount(){  //Se establecen los valores iniciales de la cuenta
    name = "Francisco Piñeiro";
    accNum= 0001;
    balance= 1500.25;
}

public double deposit(){ //Metodo para hacer un deposito a la cuenta
    return this.deposit;
}

public double withdraw(){ //Metodo para hacer un retiro a la cuenta
    return this.withdraw;
}

public double balance(){ //Metodo para obtener el saldo de la cuenta
    return this.balance;
}
    
}