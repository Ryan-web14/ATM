
public class Test
{
    public static void main(String [] args)
    {

        // LoginCheck check = new LoginCheck();
        // Account user = check.checkCredential("JojoB", 1410);

        // user.displayAccount();

        Account user2 = new Account(3,"Pascal", "BILO", "pascoBil", 2580,50000);

        Account user3 = new Account(4,"Pola", "ILO", "coBil", 2580,50000);

        AccountManager acm = new AccountManagerImpl();
        
        //acm.addAccount(user2);
        //acm.addAccount(user3);

        acm.deleteAccount(1);

        Deposit dep = new Deposit(1, 3, 5000);
        dep.displayTransactionInfo();
    }
}