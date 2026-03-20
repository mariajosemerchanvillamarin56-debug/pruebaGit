/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciopractica;

import ejerciciopractica.Modelo.Atencion;
import ejerciciopractica.Modelo.Mascota;
import ejerciciopractica.Modelo.Veterinario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class EjercicioPractica {

     static  List<Veterinario>veterinarios = new ArrayList<>();
       static List<Mascota>mascotas = new ArrayList<>();
    public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
       
        int opcion;
        do{
            System.out.println("Clinica");
            System.out.println("\n1.Registar veterinario \n2. Reistrar mascota \n3. Listar Veterinario \n4.Listar mascotas \n5.Registrar atencion \n6. Salir");
            opcion = lector.nextInt();
            switch (opcion) {
                case 1:
                    registarVeterinario();
                    
                    break;
                case 2:
                    registarMascota();
                    break;
                case 3:
                    listarVeterinario();
                    break;
                    
                case 4:
                    listarMascota();
                    break;
                case 5:
                    registarAtencion();
                    break;
                    
                default:
                    throw new AssertionError();
            }
        }while(opcion !=0);
        
    }

    public static void registarVeterinario(){
        Scanner lector= new Scanner(System.in);
        System.out.println("id: ");
        int id= lector.nextInt();
        lector.nextLine();
        System.out.println("nombre: ");
        String nombre = lector.nextLine();
        System.out.print("Dirección: ");
        String direccion = lector.nextLine();
        System.out.print("Teléfono: ");
        String telefono = lector.nextLine();
        veterinarios.add(new Veterinario(id, nombre, direccion, telefono));
        System.out.println("veterinario Registrado");
        
        
                }
     public static void registarMascota(){
        Scanner lector= new Scanner(System.in);
        System.out.print("ID: ");
        lector.nextLine();
        System.out.print("Dueño: ");
        String dueno = lector.nextLine();
        System.out.print("Dirección: ");
        String direccion = lector.nextLine();
        System.out.print("Teléfono: ");
        String telefono = lector.nextLine();
        mascotas.add(new Mascota(dueno, dueno, direccion, telefono));
         System.out.println("Mascota Registrada");
}
    public static void listarVeterinario(){
        System.out.println("veterinarios: ");
        for (Veterinario v : veterinarios) {
            System.out.println(v);
        }
        
    }
     public static void listarMascota(){
         System.out.println("Mascotas: ");
         for (Mascota m : mascotas) {
             System.out.println(m);

         }
     }
     public static void registarAtencion(){
         Scanner lector = new Scanner(System.in);
     
          if (mascotas.isEmpty()|| veterinarios.isEmpty() ) {
              System.out.println("mascota y veterinario registrado");
              return;
                 
             }
          System.out.println(" id mascota: ");
          int idMascota = lector.nextInt();
        lector.nextLine();

        Mascota mascota = null;
        for (Mascota m : mascotas) {
            if (m.id == idMascota) {
                mascota = m;
                break;
            }
        }

        if (mascota == null) {
            System.out.println(" Mascota no encontrada.");
            return;
        }

        System.out.print("ID Veterinario: ");
        int idVet = lector.nextInt();
        lector.nextLine();
        Veterinario vet = null;
        for (Veterinario v : veterinarios) {
            if (v.id == idVet) {
                vet = v;
                break;
            }
        }

        if (vet == null) {
            System.out.println(" Veterinario no encontrado.");
            return;
            

        
       
        }}
}