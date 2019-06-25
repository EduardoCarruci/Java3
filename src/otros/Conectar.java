
package otros;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conectar {

    static String bd = "escuela";
     public String url = "jdbc:mysql://localhost:3306/escuela";

    public String users = "root";
    public String password = "";
    Connection connection = null;

    //Metodo que devuelve conexion con la base de datos
    public Conectar(String url) {
        try {
               Class.forName("org.gjt.mm.mysql.Driver");
            connection = DriverManager.getConnection(url, this.users,this.password);
            if (connection != null) {
                System.out.println("Conexión a base de datos " + bd + " OK\n");
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
