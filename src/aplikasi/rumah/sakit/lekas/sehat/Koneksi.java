/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasi.rumah.sakit.lekas.sehat;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alfianda Syahrul
 */
public class Koneksi {
    public static Connection conn;
    public static void main(String args[]) {
        try{
            String url ="jdbc:mysql://localhost/bpjs";
            String user ="root";
            String pass ="";
            conn = (Connection) DriverManager.getConnection(url,user,pass);
            System.out.println("koneksi berhasil");
        } catch (Exception e){
            System.err.println("Koneksi gagal" +e.getMessage());
        }
    }
    
    public static Connection connectDB(){
        String url ="jdbc:mysql://localhost/bpjs";
        String user ="root";
        String pass ="";
        try{
            conn = (Connection) DriverManager.getConnection(url,user,pass);
        }catch (SQLException e){
            System.err.println("koneksi gagal" +e.getMessage());
        }
        return conn;
    }
}
