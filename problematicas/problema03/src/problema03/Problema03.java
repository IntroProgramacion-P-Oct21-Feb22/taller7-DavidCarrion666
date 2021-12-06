/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

/**
 *
 * @author Usuario
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int limite = 37;
        int valor = 2;
        int suma = 3;
        String cadena = "";

        
        
        do {
            cadena = String.format("%s %s", cadena, valor);

            valor = valor + suma;
            suma = suma + 2;

        } while (valor <= limite);

        System.out.printf("%s", cadena);

    }

}
