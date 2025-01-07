import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static void main(String[] args) {
        String url = "jdbc:sqlserver://localhost:1433;databaseName=DadosBancarios;encrypt=false;trustServerCertificate=true;";
        String username = "sa";
        String password = "83764937";

        try {
            // Carregar o driver JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Estabelecer a conexão
            Connection connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                System.out.println("Conectado ao banco de dados com sucesso!");
            } else {
                System.out.println("Falha na conexão.");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
