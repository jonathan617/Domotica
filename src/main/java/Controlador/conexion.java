/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class conexion {
    Connection cnn;
    public Connection conexionbd(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Error en driver"+ ex);           
            
        }
        try{
            cnn=DriverManager.getConnection("jdbc:mysql://localhost/DbTienda","root", "Jonathan-2277235");
            JOptionPane.showMessageDialog(null, "Conexion ok");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en nuestro localhost"+e);
        }
        return cnn;
    }
    public static void main(String[] arg){
        conexion con=new conexion();
        con.conexionbd();
    }
        
}
