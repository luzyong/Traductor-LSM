/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.traductor;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author luanb
 */
public class SubirImagen {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el nombre del verbo");
        String nombre = leer.nextLine();
        System.out.println("Ingresa la ruta de la imagen");
        String ruta = leer.nextLine();
        try{
            conexion conec = new conexion();
            Connection con = conec.conexion();
            String insertar ="INSERT INTO verbos (Verbos, Imagen) VALUES(?,?)";
            File file = new File(ruta);
            FileInputStream fi = new FileInputStream(file);
            PreparedStatement inser = con.prepareStatement(insertar);
            inser.setString(1, nombre);
            inser.setBinaryStream(2,fi);
            inser.executeUpdate();
            System.out.println("Después del update");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Error al guardar" + e);
        }
       
    }
}
