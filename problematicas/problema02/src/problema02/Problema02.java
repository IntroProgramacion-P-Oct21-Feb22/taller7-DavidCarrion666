/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author Usuario
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int limite = 110;
        int valor = 2;
        int suma = 4;
        String cadena = "";

        while (valor <= limite) {

            cadena = String.format("%s %s", cadena, valor);

            valor = valor + suma;
            suma = suma + 2;

        }
        System.out.printf("%s", cadena);

    }

}
