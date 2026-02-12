/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package talle1;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Talle1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ejercicio1();
        //ejercicio2();
       // ejercicio3();
       // ejercicio4();
       ejercicio5();
    }
     public static void  ejercicio1() {
       
       
        Scanner lector= new Scanner(System.in); 
        System.out.println("Ingrese su numero: ");
        int n1 = lector.nextInt();
        System.out.println("Ingrese su numero: ");
        int n2 = lector.nextInt();
        System.out.println("Ingrese su numero: ");
        int n3 = lector.nextInt();
        System.out.println("Ingrese su numero: ");
        ejercicio2();
        int n4 = lector.nextInt();
        System.out.println("Ingrese su numero: ");
        int n5 = lector.nextInt();
        
        int promedio = (n1 + n2 + n3 + n4 + n5);
        System.out.println("su promedio es " + promedio);
        
    }
    public static void  ejercicio2()    {
        
    Scanner calificacion = new Scanner(System.in);
        
      
        System.out.print("Ingresa la nota final de los parciales:");
        float parciales = calificacion.nextFloat();
        
        System.out.print("Ingresa la nota final de los quizz:");
        float quiz = calificacion.nextFloat();
        
        System.out.print("Ingresa la nota final de los trabajos:");
        float trabajos = calificacion.nextFloat();
        
        double promedio = (parciales*0.55)+(quiz*0.3)+(trabajos*0.15);
        
        System.out.println("El resultado del promedio es; " + promedio);
        
        
    }
    
    public static void  ejercicio3(){
     Scanner trabajo = new Scanner(System.in);  
     
        System.out.println("ingrese el nombre: ");
        String nombre = trabajo.nextLine();
        
        System.out.println("horas de trabajo: ");
        int horas = trabajo.nextInt();
        
        System.out.println("Pago por horas : ");
        int pagohoras = trabajo.nextInt();
        
        int sueldo = (horas*pagohoras);
        System.out.println("Empleado : " + nombre);
        
        
        System.out.println(" Sueldo mensual es : " + sueldo);
            
    }
    public static void  ejercicio4(){
        Scanner algoritmo = new Scanner(System.in);  
        System.out.println("ingrese un numero");
        int num = algoritmo.nextInt();
        
        if(num % 2 == 0 ){
            System.out.println("el numero es PAR ");
            
        }else {
            System.out.println("El numero es iIMPAR");
            
        }
    
    }
    
    
     public static void  ejercicio5(){  
      Scanner num= new Scanner(System.in);  
         System.out.println("Escriba los numeros: ");
      int n1 = num.nextInt();
      int n2 = num.nextInt();
      int n3 = num.nextInt();  
      
      if( n1 + n2 == n3 || n1 + n3 == n2 || n3 + n2 == n1){
          System.out.println("la suma de los 2 numeros ");
          
          
      }else{
          System.out.println("no es la suma");
      }
    } 
     
     
}
