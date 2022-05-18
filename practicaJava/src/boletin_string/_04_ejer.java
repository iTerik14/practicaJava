package boletin_string;

import java.util.Scanner;

/**
 *
 * @author ERIK
 *      Crear un programa que lea por teclado una cadena y un carácter, y reemplace
 *      todos los dígitos en la cadena por el carácter. Ej: su clave es: 1540 y X
 *      debería devolver su clave es: XXXX
 */
public class _04_ejer {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String text = l.nextLine();
        String caracter = l.nextLine();
        String [] nCad=text.split("");
        for (int i = 0; i < nCad.length; i++) {
            nCad[i]=caracter;
        }
        for (String nCad1 : nCad) {
            System.out.print(nCad1);
        }
        System.out.println("");
    }
}
