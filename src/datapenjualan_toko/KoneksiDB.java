/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datapenjualan_toko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {
    //membuat variabel bertipe connection
    private static Connection koneksi;
    
    public static Connection getKoneksi() {
        //method ini berfungsi untuk membuat koneksi ke mySQL
        if (koneksi == null) {
            
            try {
                String url = "jdbc:mysql://localhost:3306/datapenjualan";
                String username = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                koneksi = DriverManager.getConnection(url, username, password);  
            }
            catch (SQLException e) {
                System.out.println("Gagal membuat koneksi");
            }
        }
        return koneksi;
    }
}
