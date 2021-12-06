/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

/**
 *
 * @author Usuario
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int limite = 15;
        int numerador = 1;
        int denominador = 3;
        String cadena = "";
        String signo = "";

        do {

            if ((denominador == 3) || (denominador == 7) || (denominador == 11)
                    || (denominador == 15)) {
                signo = "-";
            } else {
                if ((denominador == 5) || (denominador == 9)
                        || (denominador == 13)) {
                    signo = "+";
                }

            }
            
         
           cadena = String.format("%s %s %s/%s", cadena, signo, numerador,
                   denominador);
                denominador = denominador + 2;
        } while (denominador <= limite);
        
        System.out.printf("1" + cadena);
    }
    
}
