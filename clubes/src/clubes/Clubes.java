
package clubes;

import clubes.model.Conexao;
import clubes.view.TelaPrincipal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Clubes {

    public static void main(String[] args) throws SQLException {
    
       Connection conexao = Conexao.conecta();
       
        TelaPrincipal abertura = new TelaPrincipal();
        abertura.setVisible(true);
        
    }
    
}
