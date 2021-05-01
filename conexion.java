/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.traductor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author luanb
 */
public class conexion {
    Connection conect = null;
    public Connection conexion()
        {
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                conect = DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/K1Hs605wQG?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","K1Hs605wQG","DXTw1wUMeq");
                System.out.println("conexion establecida");
                JOptionPane.showMessageDialog(null,"Conectado");
                
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("error de conexion");
                JOptionPane.showMessageDialog(null,"Error de conexion"+e);
            }
            return conect;
        }
}
