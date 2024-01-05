/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Lenovo
 */
public class ClassDatabase {
    public static String PathReport=System.getProperty("user.dir") + "/src/Laporan";
        private static Connection ClassDatabase;
        public static Connection getkoneksi() {
            if (ClassDatabase==null) {
                try {
                String url=new String();
                String user=new String();
                String password=new String();
                url="jdbc:mysql://localhost:3306/ dbMahasiswa";
                user="root";
                password="";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                ClassDatabase=DriverManager.getConnection(url,user,password);
            }catch (SQLException t) {
                    System.out.println("Error membuat koneksi");
            }
        }
        return ClassDatabase;
}

    public static Connection getKoneksi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
