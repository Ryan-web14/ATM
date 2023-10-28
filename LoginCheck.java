import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class LoginCheck
{
 public LoginCheck(){}

 public Account checkCredential(String InputUsername,int Inputpin)
 {
    Account customer = null;
    try
    {
    String url = "jdbc:mysql://localhost:3306/bankdatabase?useSSL=FALSE";
String pswd = "jOJoRR-@1203_)";
    String user = "root";
    Connection co = DriverManager.getConnection(url,user,pswd);
    
    String sql1 = "select userName, pin from account where userName = ?";
    PreparedStatement ps = co.prepareStatement(sql1);

    ps.setString(1, InputUsername);

    ResultSet rs = ps.executeQuery();

    if(rs.next())
    {
        customer = new Account();
        customer.setUserName(rs.getString("userName"));
        customer.setPin(rs.getInt("pin"));
        customer.setBalance(rs.getInt("balance"));
        
        
    }
    else
    {
        System.out.println("Wrong credential try again !!");
    }
    
}catch(SQLException e)
{
    System.err.println(e.getMessage());
}


        return customer;
 }


}