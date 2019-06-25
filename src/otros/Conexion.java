package otros;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;

public class Conexion {
   
    public String db = "mydb";
   
    public String url = "jdbc:mysql://localhost:3306/escuela";

    public String users = "root";
    public String password = "";
    Connection connection = null;

    public Conexion() {
    }

    public Connection conectar() {

        Connection link = null;

        try {
            
            Class.forName("org.gjt.mm.mysql.Driver");
            link = DriverManager.getConnection(this.url, this.users, this.password);

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

        return link;

    }
    
     public Conexion(String url) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(this.url, this.users, this.password);
            if (connection != null) {
          
            }
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void desconectar() {
        try {
            connection.close();
        } catch (SQLException ex) {
        }
    }
}
