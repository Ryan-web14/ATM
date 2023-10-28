package DbManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnectionManager
{
    private DatabaseConnectionManager(){};

    public static Connection getDatabaseConnection()
    {
        if(co == null)
        {
          try 
          {
            co = DriverManager.getConnection(url, user, password);
          
          } catch (SQLException e) {
            e.printStackTrace();
          }
          
        }
        return co;
    }

    public void closeDatabaseConnection()
    {
        if(co != null)
        {
            try 
            {
                co.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }



    private static Connection co;
    private static final  String url = "jdbc:mysql://localhost:3306/bankdatabase?useSSL=FALSE";
    private static final  String  user = "root";
    private static final  String  password = "jOJoRR-@1203_)";
}