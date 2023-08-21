package conexao;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    
    public Connection getConexao() {
        try {
            //tentar estabelecer a conexão
            Connection conn = DriverManager.getConnection(
                     "jdbc:mysql://localhost:3306/projetojavacrud?serverTimezone=UTC", // linha de conexão
                    "root", //usuário do mysql
                    "" // senha do mysql
            );
            return conn;
            
        } catch (Exception e) {
            //se deu erro na hora de conectar
            System.out.println("ERRO AO CONECTAR " + e.getMessage());
            return null;
        }
    }
}
