/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.traductor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
/**
 *
 * @author luanb
 */
public class Traductor {
      
      boolean regexcomprueba(String cadena){
      Pattern pat = Pattern.compile("[A-z]+AR|[A-z]+ER|[A-z]+IR");
      Matcher mat = pat.matcher(cadena.toUpperCase());
      return mat.matches();
       }
     /* void guarda(){
        String comprueba;
        String arreglo[] ={"SALTAR","JUGAR","VIVIR","IR"};
        for(int i=0; i<arreglo.length;i++){
            comprueba = arreglo[i].toLowerCase();
            if(comprueba.equals(cadena)&& i<arreglo.length){
                System.out.println(arreglo[i]);
                break;
            }
            else{
                System.out.println("kestapasando");
            }
        }
     }*/
       
       
 public class Mostrar{
          String comprueba;
          String arreglo[] ={"SALTAR","JUGAR","VIVIR","IR"};
         void mostrar(String cadena){
           for(int i=0; i<arreglo.length;i++){
           comprueba = arreglo[i].toLowerCase();
            if(comprueba.equals(cadena)&& i<arreglo.length){
               System.out.println(arreglo[i]);
               break;
               }
             else{
               System.out.println("kestapasando");
              }
             }
            }
            }
}
