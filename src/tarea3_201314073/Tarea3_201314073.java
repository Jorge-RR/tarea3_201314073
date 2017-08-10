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

 String []cont= new String[5];
 
    Scanner lector = new Scanner (System.in);
    
        System.out.println("1. usuario");
        System.out.println("2. palabras palíndromas");
        System.out.println("3.salir");
          int menprincipal=lector.nextInt();

switch(menprincipal){
    
        
    case 1: 
     
        while(menprincipal==1){
             int elegir=0;
             System.out.println("Menu usuario");
             Scanner opciones = new Scanner(System.in);
             System.out.println("1. ingressar usuario");
             System.out.println("2. Mostrar todo los usuarios");
             System.out.println("3. Mostrar un usuario personalizado");
             System.out.println("4. menu principal");
             System.out.println("5. salir");
               elegir=opciones.nextInt();
                
                String contenido;
                if(elegir==1){
                    
                          
                       
                      
                          
                       for(int i=0; i<cont.length;i++){
        Scanner pedir=new Scanner(System.in);
        System.out.println("ingrese usuario ");
        contenido=pedir.next();
        cont[i]=contenido;
      
                              
                             
                         
                          }
                          System.out.println("1.salir");
                          Scanner lector2= new Scanner(System.in);
                          int salir=lector2.nextInt();
                }
                if(elegir==2){
                    System.out.println("mostrar usuarios");
            
                    for(int i=0;i <cont.length;i++){
                        int y=i+1;
                        System.out.println(y+" "+cont[i]);
                    }
                
                }
                if(elegir==3){
                    String buscar1="";
                    System.out.println("ingrese usurio ");
                Scanner lector4=new Scanner(System.in);
                String buscar=lector4.nextLine();
                for(int i=0;i <cont.length;i++)
                    buscar1=cont[i];
                if(buscar.equals(buscar1))
                                System.out.println("el usuario existe");
                        else 
                            System.out.println("error el usuario no existe ");
                
                }
                if (elegir==4){
                 
               
                }
                if(elegir==5){
                System.exit(0); 
                }
        }
               

    break;
     case 2:
     
            System.out.println("Palabras palindromas");
            
            Scanner elegir1 = new Scanner(System.in);
            String palabra,alrevez=""; 
            System.out.println("Ingrese Palabra");
           palabra = elegir1.nextLine();
              
            for(int x=palabra.length()-1;x>=0;x--){
            
            alrevez+=palabra.charAt(x);}
            if(palabra.equals(alrevez)){
                System.out.println("Si es palindroma");
            }else{
                    System.out.println("no es palindroma");
            
            }
            
            
            
            
            
                     break;
     case 3:
         System.exit(0);        
         break;                 
default: 
                System.out.println("opcion incorrecta");
            break;
}

// TODO code application logic here
    }
    }

