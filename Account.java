

public class Account
{
   public Account(){}
   public Account(String name, String surname,String userName, int pin, int balance)
   {
     _name = name;
     _surname = surname;
     _pin = pin;
     _userName = userName;
     _balance = balance;
   }
   
   //check if the pin matches with the account in the database
   public boolean checkPin(int userPin)
   {
    if(userPin == getPin())
      return true;
    else 
      return false;
   }
  
   //check if the username with the account in the database
   public boolean checkUsername(String userName)
   {
    if (userName == getUserName())
      return true;
    else 
      return false;
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

   //getter
   public String getName(){return _name;}
   public String getSurname(){return _surname;}
   public int getPin(){return _pin;}
   public String getUserName(){return _userName;}
   public int getBalance(){return _balance;}
   
   //setter 
   public void setName(String name){_name = name;}
   public void setSurname(String surname){_surname = surname;}
   public void setPin(int pin){_pin = pin;}
   public void setUserName(String userName){_userName = userName;};
   public void setBalance(int balance){_balance = balance;}
   
   private String _userName;
   private String _name;
   private String _surname;
   private int _pin;
   private int _balance;

}