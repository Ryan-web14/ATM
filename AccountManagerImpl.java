
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import DbManager.DatabaseConnectionManager;

public class AccountManagerImpl implements AccountManager
{
    @Override
    public void addAccount(Account account)
    {
        try 
        {
            
          Connection co = DatabaseConnectionManager.getDatabaseConnection();
          String query = "INSERT INTO ACCOUNT(ACCOUNTNUMBER,USERNAME,NAME,SURNAME,PIN,BALANCE) VALUES (?,?,?,?,?,?  )";
          PreparedStatement ps = co.prepareStatement(query);

          ps.setInt(1, account.getAccountNumber());
          ps.setString(2,account.getUserName());
          ps.setString(3,account.getName());
          ps.setString(4, account.getSurname());
          ps.setInt(5, account.getPin());
          ps.setInt(6, account.getBalance());

          int rowAdded = ps.executeUpdate();

          if(rowAdded > 0)
          {
            System.out.println("Account sucessfully created");
            account.displayAccount();
          }

            
        } catch (SQLException e) 
        {
             e.printStackTrace(); 
        }
      
      
    }

    @Override
    public void deleteAccount(int accountNumber)
    {
      try {

        Connection co = DatabaseConnectionManager.getDatabaseConnection();
        String query = "DELETE FROM ACCOUNT WHERE ACCOUNTNUMBER = ?";
        PreparedStatement ps = co.prepareStatement(query);
        
        ps.setInt(1, accountNumber);
        ps.executeUpdate();
      } catch (SQLException e) {
        e.printStackTrace(
          
        );
      }


    }

}