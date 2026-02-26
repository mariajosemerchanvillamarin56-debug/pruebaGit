/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller5;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Taller5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int cantidad = pedirCantidadEstudiantes(lector);
        int opcion = elegir(lector);

        int aprobados = estudiantes(cantidad, opcion, lector);

        System.out.println("\nTotal de estudiantes aprobados: " + aprobados);

        lector.close();
    }

    // Método para pedir cantidad de estudiantes
    public static int pedirCantidadEstudiantes(Scanner lector) {
        System.out.print("Ingrese cantidad de estudiantes: ");
        return lector.nextInt();
    }

    // Método para elegir 1 o 2
    public static int elegir(Scanner lector) {
        System.out.println("\nTipo de ponderación:");
        System.out.println("1. Proyecto 30%  Parcial 30%  Final 40%");
        System.out.println("2. Proyecto 40%  Parcial 40% Final 20%");
        System.out.print(" opción: ");
        return lector.nextInt();
    }

    // Método para procesar estudiantes
    public static int estudiantes(int n, int opcion, Scanner lector) {

        int contadorAprobados = 0;

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEstudiante " + i);

            System.out.print("Nota Proyecto: ");
            double proyecto = lector.nextDouble();

            System.out.print("Nota Parcial: ");
            double parcial = lector.nextDouble();

            System.out.print("Nota Final: ");
            double examenFinal = lector.nextDouble();

            double notaFinal = calcularNota(proyecto, parcial, examenFinal, opcion);

            System.out.printf("Nota definitiva:  ", notaFinal);

            if (notaFinal >= 3.0) {
                System.out.println("¡Aprobado!");
                contadorAprobados++;
            } else {
                System.out.println("Reprobado");
            }
        }

        return contadorAprobados;
    }

    // Método para calcular nota final
    public static double calcularNota(double proyecto, double parcial, double examenFinal, int opcion) {

        double nProyecto = 0.3;
        double nParcial = 0.3;
        double nFinal = 0.4;

        if (opcion == 2) {
            nProyecto = 0.4;
            nParcial = 0.4;
            nFinal = 0.2;
        }

        double acumulador = 0;

        acumulador += proyecto * nProyecto;
        acumulador += parcial * nParcial;
        acumulador += examenFinal * nFinal;

        return acumulador;
    }
}
    
    

