import DbManager.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Deposit extends Transaction
{
    public Deposit(int depositNumber,int accountNumber,int amount)
    {
        super(depositNumber,"Deposit",accountNumber);

    }

    @Override
    public void displayTransactionInfo(){}


}