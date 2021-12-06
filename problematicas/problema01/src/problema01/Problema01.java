/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String posicion;
        int edad;
        double estatura;
        double suma_edades = 0;
        String cadena = "";
        int contador = 0;
        double promedio_edad = 0;
        double promedio_estatura = 0;
        String salida;
        String cadena2 = "";
        double suma_estatura = 0;

        boolean bandera = true;

        do {

            System.out.println("ingrese el nombre del jugador");
            nombre = entrada.nextLine();

            System.out.println("ingrese la posicion del jugador");
            posicion = entrada.nextLine();

            System.out.println("ingrese la edad del jugador");
            edad = entrada.nextInt();

            System.out.println("ingrese la estatura del jugador");
            estatura = entrada.nextDouble();

            contador = contador + 1;
            suma_edades = suma_edades + edad;
            suma_estatura = suma_estatura + estatura;

          cadena = String.format(cadena + "%s - %s - edad %s - estatura %.2f\n",
                     nombre, posicion, edad, estatura);

            cadena2 = String.format(cadena2 + "%s-", edad);

            System.out.println("Ingrese si para salir del proceso");
            salida = entrada.nextLine();

            salida = entrada.nextLine();
            if (salida.equals("si")) {
                bandera = false;
            }

        } while (bandera);

        promedio_edad = suma_edades / contador;
        promedio_estatura = suma_estatura / contador;

        System.out.println(cadena);
        System.out.println("Listado edades" + "" + cadena2);
        System.out.printf("promedio edades  %.2f\npromedio estatura %.2f\n",
                promedio_edad, promedio_estatura);

    }

}
