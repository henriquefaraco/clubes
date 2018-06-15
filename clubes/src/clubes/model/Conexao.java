package clubes.model;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

    
    public static Connection conecta() throws SQLException {
       
        Connection con = null;
        String url = "jdbc:mysql://localhost/";
        String bd = "exemplojava";
        String user = "root";
        String pass = "";
      
        try{
        con = DriverManager.getConnection(url+bd, user, pass);
            System.out.println("!");
                        
        }catch(SQLException e){
           System.out.println("Erro de conexão: "+e);
        }
        return con;
    }    
}
