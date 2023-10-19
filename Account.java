

public class Account
{
   public Account(){}
   public Account(String name, String surname, int pin)
   {
     _name = name;
     _surname = surname;
     _pin = pin;
   }
   
   //getter
   public String getName(){return _name;}
   public String getSurname(){return _surname;}
   public int getPin(){return _pin;}
   
   //setter 
   public void setName(String name){_name = name;}
   public void setSurname(String surname){_surname = surname;}
   public void setPin(int pin){_pin = pin;}
    
   private String _name;
   private String _surname;
   private int _pin;
}