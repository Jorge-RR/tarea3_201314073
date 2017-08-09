/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea3_201314073;

import java.util.Scanner;

/**
 *

 */
public class Tarea3_201314073 {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Tarea_3 ");
        System.out.println("201314073");

int menprincipal=0; 
    Scanner lector = new Scanner (System.in);
        System.out.println("1. usuario");
        System.out.println("2. palabras palíndromas");
        System.out.println("3.salir");
           menprincipal=lector.nextInt();

switch(menprincipal){
 
    case 1: 
             int elegir=0;
             System.out.println("Menu usuario");
             Scanner opciones = new Scanner(System.in);
             System.out.println("1. ingressar usuario");
             System.out.println("2. Mostrar todo los usuarios");
             System.out.println("3. Mostrar un usuario personalizado");
             System.out.println("4. menu principal");
             System.out.println("5. salir");
               elegir=opciones.nextInt();
                
                if(elegir==1){
                    
                          
                       
                      String contenido;
                          String []cont= new String[5];
                          for(int i=0; i< cont.length;i++){
                           Scanner lector1= new Scanner(System.in);
                          System.out.println("ingrese un numero");
                                contenido=lector1.next();
                            cont[0]=contenido;
                           
            
                        }
                 
               
                }
                if(elegir==2){
                
                }
                if(elegir==3){}
                if (elegir==4){}
                if(elegir==5){}
               
               

    break;
     case 2:
            System.out.println("Palabras palindromas");
            String palabra;
            Scanner elegir1 = new Scanner(System.in);
            System.out.println("Ingrese Palabra");
            palabra=elegir1.toString();
            
            
                     break;
     case 3:
                     break;                 
default: 
                System.out.println("opcion incorrecta");
            break;
}

// TODO code application logic here
    }
    
}
