/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otros;

import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Consultas {

    public static InputStream Imagen(int buscador) {
        String bd = "archivos";
        String url = "jdbc:mysql://localhost:3306/escuela";
        Conectar db = new Conectar(url);
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT foto FROM aula where id='"+buscador+"'";
        InputStream inp = null;
        try {
            ps = db.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {

                inp = rs.getBinaryStream(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                ps.close();
                db.desconectar();
            } catch (SQLException ex) {
            }
        }
        return inp;
    }
    public static InputStream Imagenfotoniño(int buscador) {
        String bd = "archivos";
        String url = "jdbc:mysql://localhost:3306/escuela";
        Conectar db = new Conectar(url);
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT foto FROM niños where id='"+buscador+"'";
        InputStream inp = null;
        try {
            ps = db.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("pase por imagen foto niño");
                inp = rs.getBinaryStream(1);
            }
            System.out.println("todo bien");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                ps.close();
                db.desconectar();
            } catch (SQLException ex) {
            }
        }
        return inp;
    }
    public static InputStream Imagenfotofamiliar(int buscador) {
        String bd = "archivos";
        String url = "jdbc:mysql://localhost:3306/escuela";
        Conectar db = new Conectar(url);
        PreparedStatement ps = null;
        ResultSet rs = null;
        String query = "SELECT foto_familiar FROM niños where id='"+buscador+"'";
        InputStream inp = null;
        try {
            ps = db.getConnection().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {

                inp = rs.getBinaryStream(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            try {
                rs.close();
                ps.close();
                db.desconectar();
            } catch (SQLException ex) {
            }
        }
        return inp;
    }

}
