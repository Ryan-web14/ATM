import DbManager.*;


abstract public class Transaction
{
    public Transaction(int transactionNumber,String transactionName,int accountNumber)
    {
        _transactionNumber = transactionNumber;
        _accountNumber = accountNumber;
        _transactionName = transactionName;
    }

    public int getAccountNumber()
    {
        return _accountNumber; 
    }

    abstract public void displayTransactionInfo();



    private int _transactionNumber; 
    protected int _accountNumber;
    private String _transactionName;
}