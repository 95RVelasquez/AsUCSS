
package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rony VC
 */
public class Conexion{
    private String driver="com.mysql.jdbc.Driver";
    private String bd= "bdasesoria";
    private String url= "jdbc:mysql://localhost:3306/"+bd+"";
    private String user= "root";
    private String pass= "";


    public   Conexion() {
        this.driver = "com.mysql.jdbc.Driver";
        this.bd = "bdasesoria";
        this.url = "jdbc:mysql://localhost:3306/"+bd+"";
        this.user = "root";
        this.pass = "";
    }
  public Connection getConexion(){
        Connection cn;
        try{
          Class.forName(this.driver);  
          cn=DriverManager.getConnection(this.url,this.user,this.pass);
        }catch(ClassNotFoundException | SQLException e){
            cn=null;
        }
        return cn;
    }
    public  String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    
    
      
}
