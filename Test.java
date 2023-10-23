
public class Test
{
    public static void main(String [] args)
    {

        LoginCheck check = new LoginCheck();
        Account user = check.checkCredential("JojoB", 1410);

        user.displayAccount();





        
        
    }
}