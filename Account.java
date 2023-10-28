    
import java.io.Serializable;

public class Account implements Serializable
{
   public Account(){}

   public Account(String userName, int pin)
   {
    _userName = userName;
    _pin = pin;
    _accountNumber++;
   }
   public Account(int number,String name, String surname,String userName, int pin, int balance)
   {
     _name = name;
     _surname = surname;
     _pin = pin;
     _userName = userName;
     _balance = balance;
     _accountNumber = number;
   }

   public void displayAccount()
   {
     System.out.println("account N°"+_accountNumber+ " Username: " + getUserName() + " \nbalance: " + getBalance() + "\nuserpin: " + getPin());
   }
   


  public void deposit(int amount)
  { 
      setBalance(_balance + amount);
  }

  public void withdraw(int amount)
  {
    setBalance(_balance - amount);
  }

  public void displayBalance()
  {
    System.out.println("Your balance is " + _balance);
  }

  public boolean isAdmin(int pin)
  {
    if(pin == _adminPin)
      return true;
    else
      return false;
  }

   //getter
   public int getAccountNumber(){return _accountNumber;}
   public String getName(){return _name;}
   public String getSurname(){return _surname;}
   public int getPin(){return _pin;}
   public String getUserName(){return _userName;}
   public int getBalance(){return _balance;}
   public int getAdminPin() {return _adminPin;}
   
   //setter 
   public void setName(String name){_name = name;}
   public void setSurname(String surname){_surname = surname;}
   public void setPin(int pin){_pin = pin;}
   public void setUserName(String userName){_userName = userName;};
   public void setBalance(int balance){_balance = balance;}
   
   private int _accountNumber = 0;
   private String _userName;
   private String _name;
   private String _surname;
   private int _pin;
   private int _balance;
   private int _adminPin;

}