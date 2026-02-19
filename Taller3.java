/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller3;

import java.util.Scanner;

/**
 *
 * @author UIS
 */
public class Taller3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejercicio1();
        //ejercicio2();
        //ejercicio3();
       // ejercicio4();
    }
        public static void ejercicio1(){
     Scanner lector = new Scanner(System.in);
     int opcion;
     do{
         System.out.println(" /n MENU");
         System.out.println("1.INICIO");
         System.out.println("2.DESPEDIRSE");
         System.out.println("3.SALIR");
         System.out.println("Elija una opcion: ");
         opcion=lector.nextInt();
         
         switch (opcion) {
             case 1:
                 System.out.println("Hola");
             case 2:
                 System.out.println("Hasta luego");
             case 3:
                 System.out.println("Salida");
             break;
             default:
                 
                 System.out.println("invalidad");
         }
     }while (opcion !=3 ); 
     
                
            }
                 
        public static void ejercicio2(){     
          Scanner lector = new Scanner(System.in);
          int opcion;
          do{
              System.out.println("Menu de Areas");
              System.out.println("1.A Cuadrado\n2.A circulo\n3.A triangulo\n4.A Rectangulo\n5.Salir");
              System.out.println("Elija una opcion: ");
              opcion=lector.nextInt();
              switch (opcion) {
                  case 1:
                      System.out.println("medida lado de cuadrado es: ");
                       double lado= lector.nextDouble();
                       System.out.println("Area del cuadrado:  " + (lado*lado));break;
                    
                 case 2:
                    System.out.println(" Ingree la medida del radio para el circulo:     ");    
                 double radio= lector.nextDouble();
                System.out.println("Area del circulo : "+ (3.14*radio*radio));break;
       
                   case 3:
                    System.out.println("Ingrese la medida de la base del triangulo:     ");    
                 double base= lector.nextDouble();
                 System.out.println(" Ingrese la altura del triangulo es de: :     ");    
                 double altura= lector.nextDouble();
                 
                System.out.println("Area del triangulo:   "+ (base*altura/2));break;
         
                    case 4:
                    System.out.println("Ingrese la medida de la base del rectangulo:     ");    
                 double baser= lector.nextDouble();
                        System.out.println("Ingrese la medida de la altura del rectangulo: ");
                 double alturar= lector.nextDouble();
                 
                System.out.println("El area del rectangulo es de: "+ (baser*alturar));break;
         
                    
                    case 5:
                        System.out.println("salir del menu");break;
                        
                default:
                    System.out.println("error en el menu");
                    
            }
            
        }while(opcion!=5);
      
        
    
    }
                       
        public static void ejercicio3(){     
          Scanner lector = new Scanner(System.in);       
          String nombre="";
          double matetaticas=0;
          double ingles=0;
          double español=0;
          int opcion;
          do{
              
        
          
          System.out.println("\n1. registrar notas");
            System.out.println("2. Promedio por materia");
            System.out.println("3. Promedio total");
            System.out.println("4. Aprovado/Reprobado");
            System.out.println("5. salir");
            System.out.println("2. elija la opcion: ");
            opcion=lector.nextInt();
            
            switch (opcion) {
                case 1:
                    lector.nextLine();
                    System.out.println("Nombre del estudiante: ");
                    nombre=lector.nextLine();
                    System.out.println("Materia matematicas:  ");
                    matetaticas=lector.nextDouble();
                    System.out.println("Materia de ingles: ");
                    ingles=lector.nextDouble();
                    System.out.println("Materia de español : ");
                    español=lector.nextDouble();
                    break;
                    
                    
                 case 2:
                     System.out.println("Matematicas "+matetaticas);
                     System.out.println("Ingles "+ingles);
                     System.out.println("Español "+español);
                    
                    break;
                    
                case 3:
                    double promedio=((matetaticas+ingles+español)/3);
                    System.out.println("Promedio total " +promedio);
                    
                    break;
                case 4:
                    double p =(matetaticas+ingles+español)/3;
                            if(p>=3)System.out.println(nombre + "aprovado ("+p+")");
                            else System.out.println(nombre + "reprobado("+p+")");
                            break;
                case 5: 
                    System.out.println("salidad");
                    break;
                    
                
            }
        }while (opcion!=5);
        
            
        }
        
          
          
          
          
         public static void ejercicio4(){     
         Scanner lector = new Scanner(System.in);    
         String hombres ="";
         String mujeres ="";
        System.out.println("cantidad de personas: ");
                int n=lector.nextInt();
                lector.nextLine();
                
                for(int i=0;i<n;i++){
                    System.out.println("NOMBRE");
                    String nombre= lector.nextLine();
                    System.out.println("sexo(f/m) ");
                    String inputSexo = lector.nextLine().toLowerCase();
                    char sexo = inputSexo.charAt(0);
                
                    switch (sexo) {
                        case f-> hombres += nombre+"\n";
                        case m -> mujeres += nombre+"\n";   
                            
                            
                        default -> System.out.println("incorrecto");
                    }
                }
    
                            System.out.println("\nHombres; + hombres");
                            System.out.println("\nMujes; + hombres");
                    }
                    
                } 
          
                      
                      
                      
        
        
          

     
        

        
        
          
