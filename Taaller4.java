/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taaller4;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Taaller4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ejercicio1();
        ejercicio2();
        
        
    }
        
     public static void  ejercicio1() {   
         Scanner lector = new Scanner(System.in);
         String nombres ="";
         String telefonos ="";
         int opcion;
         do {             
             System.out.println("Menu");
             System.out.println("\n1.registrar\n2.consultar\n3.modificar Nombre\n4.modificar Telefono\n5.Eliminar\n6.Listar\n7.salir");
             System.out.println("opcion: ");
             opcion = lector.nextInt();
             lector.nextLine();
         
             switch (opcion) {
                 case 1:
                     System.out.println("Nombre: ");
                     nombres = lector.nextLine();
                     System.out.println("Telefono: ");
                     telefonos = lector.nextLine();
                     break;
                     
                 case 2:
                        System.out.println("Nombre: "+nombres);
                        System.out.println("Telefono: "+ telefonos);
                        break;
                        
                 case 3:
                     System.out.println("Nuevo nombre: ");
                     nombres = lector.nextLine();
                     break;
                     
                 case 4:
                     System.out.println("Nuevo telefono: ");
                     telefonos = lector.nextLine();
                     break;
                     
                 case 5:
                     nombres="";
                     telefonos="";
                     System.out.println("ELIMINADO");
                     break;
                     
                 case 6:
                     System.out.println("Datos: "+nombres +"  " + telefonos);
                     break;
                     
                 case 7:
                     System.out.println("Salir");
                     break;
                     
                
             }
         
         
         }while (opcion !=7);
                   
             
         }
      public static void  ejercicio2(){
          Scanner lector = new Scanner(System.in);
          String[] cedulas = new String[100];
          int[] compras = new int[100];
          int Tpersona=0;
          int disponibles = 100;
          int vendidas=0;
          
          while (disponibles > 0) {
              System.out.println("Ingrese la cedula: ");
              String cedula = lector.nextLine();
              
              int pos = -1;
              for (int i = 0; i < Tpersona ; i++) {
                  if (cedulas[i].equals(cedula)) {
                      pos = i;
                      
                      
                  }
                  
              }
              int cantidad;
              if (pos !=-1) {
                  if(compras[pos] == 4){
                      System.out.println("ya tiene cuatro boletas NO puede comprar mas");
                     continue;
                  }
                  System.out.println("Cuantas voletas va a comprar: ");
                  cantidad = lector.nextInt();
                  lector.nextLine();
                  
                  
                  if (compras[pos] + cantidad > 4) {
                      cantidad = 4 - compras[pos];
                      System.out.println("solo puede comprar " + cantidad);
                      
                      
                  }
                 compras[pos] += cantidad;
                 
              }else{
                  System.out.println("cuantas boletas desea: ");
                  cantidad = lector.nextInt();
                  lector.nextLine();
                  
                  if(cantidad > 4){
                      cantidad=4;
                      System.out.println("Solo se pueden comprar maximo 4 boletas");
                      
                  }
                  cedulas[Tpersona]=cedula;
                  compras[Tpersona]=cantidad;
                  Tpersona++;
                  
              }
              if (cantidad>disponibles) {
                  cantidad = disponibles;
                  
                  
              }
              disponibles -= cantidad;
              vendidas+= cantidad;
              System.out.println("Total de Vendidas:  "+vendidas);
              System.out.println("Total de voletas Disponibles: " + disponibles);
          }
              System.out.println("Agotadas");
              
          }
          
                  
}
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
                  
      
          
          
          
          
          
          
          
    
     


