/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller2;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Taller2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ejercicio1();
        ejercicio3();
    }
    public static void ejercicio1(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Digete el numero que sea entero: ");
        int num = lector.nextInt();
        
        if ( num % 3 != 0 ) {
        System.out.println("No es multiploo de 3");}
         else if (num < 100 || num > 200){
            System.out.print("no estaen el rango entre 100 y 200 " );
        }
        else {
            System.out.print("Es multiplo de 3 y esta en el rango de 100 a 200 ");
        }}
    public static void ejercicio2(){
        Scanner lector = new Scanner(System.in);
            System.out.print("fecha de naciemiento: (dia) ");
            int dia = lector.nextInt();
            System.out.print("fecha de naciemiento: (mes)");
            int mes  = lector.nextInt();
            
        String signo = null;
            
            if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) signo ="ACUARIO";
            else if((mes == 2 && dia>=21) || (mes == 3 && dia<=20)) signo ="PISCIS
            else if((mes == 3 && dia>=21) || (mes == 4 && dia<=20)) signo ="ARIES";
            else if ((mes == 4 && dia>=20) || (mes == 5 && dia<=19)) signo ="TAURO";
            else if ((mes == 5 && dia>=21) || (mes == 6 && dia<=20)) signo ="GEMINIS";
            else if ((mes == 6 && dia>=21) || (mes == 7 && dia<=20)) signo ="CANCER
            else if ((mes == 7 && dia>=23) || (mes == 8 && dia<=22)) signo ="LEO";
            else if ((mes == 8 && dia>=23) || (mes == 9 && dia <= 22)) signo ="VIRGO";
            else if ((mes == 9 && dia>=23) || (mes == 10 && dia <= 22)) signo ="LIBRA";
            else if ((mes == 10 && dia>=23) || (mes == 11 && dia <= 22)) signo ="ESCORPI0";
            else if ((mes == 11 && dia>=22) || (mes == 12 && dia <= 22)) signo ="SAGITARIO";
            else if ((mes == 12 && dia>=22) || (mes == 1 && dia <= 19)) signo ="CAPICORNIO";
            
            System.out.println("su signo es :" + signo);
           
     
        }
    public static void  ejercicio3()    {
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el valor del Producto: ");
        double producto = lector.nextInt();
        System.out.println("Inrese el valor del Descuento: ");
        double descuento = lector.nextInt();
        
        double subtotal = producto*(descuento/100);
        double total =producto-subtotal;
        
        System.out.println("El valor TOTAL es: "+ total);
        
       
    }
        
    public static void punto4(){
        Scanner lector = new Scanner(System.in);
            
            System.out.print("Ingrese 3 numeros: :" );
            int a= lector.nextInt();
            int b= lector.nextInt();
            int c= lector.nextInt();
            
            
            if ( a > b) { int t = a; a = b; b = t; }
            if ( a > c) { int t = a; a = c; c = t; }
            if ( b > c) { int t = b ; b = c; c = t; }
            
            
            System.out.println("ordenado:  "+ a +"," + b + "," +c);
            System.out.println("el mayor es  " +c);
            
            
             
        }

    
    public static void punto5(){
        Scanner lector = new Scanner(System.in);
            
        System.out.print("Digite el dia: " );
        int dia = lector.nextInt();
        
        System.out.print("Digite el mes : " );
        int mes = lector.nextInt();
        System.out.print("Digite el año: " );
        int año = lector.nextInt();
        
        int diasmes = 30;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7|| mes == 8|| mes == 10|| mes == 12)
            diasmes=31;
        if (mes == 2)
        diasmes = 28;
        if ( dia > diasmes){
            dia = 1;
            if(mes > 12){
                System.out.print("dia:  "+ dia + "/" + mes + "/" + año );
                
            }
            
        }}    
        
        
        

}
        
        
    
    
