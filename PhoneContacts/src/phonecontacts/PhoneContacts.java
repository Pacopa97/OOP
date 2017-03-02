package phonecontacts;

import java.util.Scanner;

/**
 *
 * @author franc
 */
public class PhoneContacts {

    
  //public static Scanner scanner = new Scanner(System.in);
  public static MobilePhone myPhone = new MobilePhone();
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        
        int option;
        
        printMenu();
        option = scanner.nextInt();
        while(option >0 && option<7){
            switch(option){
                case 1:
                    addContact();
                    break;
                case 2:
                    updateContact();
                    break;
                case 3:
                    deleteContact();
                    break;
                case 4:
                    queryContact();
                    break;
                case 5:
                    listAll();
                    break;
                case 6:
                    printMenu();
                    break;
                default:
                    break;
               
            }
            
            System.out.println("Select an option");
            option= scanner.nextInt();
        }
    }
    
public static void printMenu(){
    System.out.println("    Menu    ");
    System.out.println("0. Quit");
    System.out.println("1. Add Contact");
    System.out.println("2. Update Contact");
    System.out.println("3. Delete Contact");
    System.out.println("4. Query Contact");
    System.out.println("5. List All Contacts");
    System.out.println("6. Print Options");
    System.out.println("Select an option");
}    


public static void addContact(){
    String name;
    int number;
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("Contact name: "); 
    name=scanner.nextLine();
 
    
  
    System.out.println("Telephone number: ");
      number=scanner.nextInt();
    
    
    if(myPhone.addContact(name,number)){
        System.out.println("Contact successfully added");
    }else
        System.out.println("Contact already on list");
}

public static void updateContact(){
    Scanner scanner = new Scanner(System.in);
    String name;
    int number;
    System.out.println("Contact name: ");
    name=scanner.nextLine();
    System.out.println("Contact number: ");
    number=scanner.nextInt();
    
    if(myPhone.updateContact(name, number)){
        System.out.println("Contact successfully updated");
    }else{
        System.out.println("Contact not found");
    }
    
}

public static void deleteContact(){
  Scanner scanner = new Scanner(System.in);
    String name;
    int number; 
    System.out.println("Contact name: ");
    name=scanner.nextLine();
    System.out.println("Contact number: ");
    number=scanner.nextInt();
if(myPhone.removeContact(name,123)){
    System.out.println("Contact deleted");
    
    
}    else{
    System.out.println("Contact not found");
}
    
}

public static void queryContact(){
    Scanner scanner = new Scanner(System.in);
    String name;
    System.out.println("Contact name: ");
    name=scanner.nextLine();
  
    System.out.println(myPhone.queryContact(name));
    
    
}

public static void listAll(){
    myPhone.listContacts();
       
    
}
}
