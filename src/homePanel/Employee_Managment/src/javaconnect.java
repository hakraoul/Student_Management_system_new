/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class javaconnect { 
    Connection conn;
    ResultSet rs;
    PreparedStatement pst;   
    public static Connection ConnnecrDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\Employee_Managment\\ems.sqlite");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
