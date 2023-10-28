import java.io.Serializable;

import DbManager.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
 


abstract public class Transaction implements Serializable
{
    public Transaction(int transactionNumber,String transactionName,int accountNumber)
    {
        _transactionNumber = transactionNumber;
        _accountNumber = accountNumber;
        _transactionName = transactionName;

        try 
        {
          Connection co = DatabaseConnectionManager.getDatabaseConnection();
          String query = "INSERT INTO TRANSACTION (TRANSACTIONNUMBER, TRANSACTIONNAME,ACCOUNTNUMBER) VALUES (?,?,?)";

          PreparedStatement ps = co.prepareStatement(query);

          ps.setInt(1, transactionNumber);
          ps.setString(2,transactionName);
          ps.setInt(3,accountNumber);

          int rowAdded = ps.executeUpdate();
          if(rowAdded > 0)
            System.out.println("Transaction successfully added");          
         
         else
           System.out.println("Not accepted");
          
    
        } catch (SQLException e) {
            e.printStackTrace();
        }
        

    }

    public int getAccountNumber()
    {
        return _accountNumber; 
    }

    public int getTransactionNumber()
    {
        return _transactionNumber;
    }

    public String getTransactionName()
    {
        return _transactionName;
    }

    abstract public void displayTransactionInfo();

    private int _transactionNumber; 
    protected int _accountNumber;
    private String _transactionName;
}