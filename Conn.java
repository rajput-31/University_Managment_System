//JDBS Connect

package university.managment.system;
import java .sql.*;

public class Conn {
    
    
    Connection c;
    Statement s;
    
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");//Package name MYSQL in this driver class 
            c = DriverManager.getConnection("jdbc:mysql:///universitymanagement" , "root" ,"HRajput@1308");//Connetctdatabase
            s = c.createStatement();
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
