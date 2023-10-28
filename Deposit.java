import DbManager.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deposit extends Transaction
{
    public Deposit(int depositNumber,int accountNumber,int amount)
    {
        super(depositNumber,"Deposit",accountNumber);

        _amount = amount;

        Connection Co = DatabaseConnectionManager.getDatabaseConnection();
        String query = "UPDATE ACCOUNT SET BALANCE = BALANCE + ? WHERE ACCOUNTNUMBER = ?";
        String query2 = "INSERT INTO DEPOSIT (DEPOSITNUMBER,ACCOUNTNUMBER,AMOUNT) VALUES (?,?,?)";

        try
        {
            PreparedStatement ps = Co.prepareStatement(query);
            PreparedStatement ps2 = Co.prepareStatement(query2);

            ps.setInt(1,amount);
            ps.setInt(2,accountNumber);

            ps2.setInt(1,depositNumber);
            ps2.setInt(2,accountNumber);
            ps2.setInt(3,amount);

            int rowAdded = ps.executeUpdate();
            int rowAdded2 = ps2.executeUpdate();

            if(rowAdded > 0 && rowAdded2 > 0)
                System.out.println("Deposit successfully added");
            else
                System.out.println("Not accepted");
            
        } catch (SQLException e) {
            
        }


    }

    public int getAmount()
    {
        return _amount;
    }

    @Override
    public void displayTransactionInfo()
    {
        System.out.println("Deposit "+ "Transaction N°"+ getTransactionNumber()+"\n "+"Account N°"+getAccountNumber()+"\n "+"Amount: "+getAmount() );
    }

    private int _amount;



}