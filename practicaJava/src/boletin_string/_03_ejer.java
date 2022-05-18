package boletin_string;

import java.util.Scanner;

/**
 *
 * @author ERIK
 *
 *      Crear un programa que lea por teclado una cadena y un carácter, y reemplace
 *      todos los espacios por el carácter. Ej: mi archivo de texto.txt y _ debería
 *      devolver mi_archivo_de_texto.txt
 * 
 * 
 */
public class _03_ejer {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String text = l.nextLine();
        String caracter = l.nextLine();
        text = text.replace(" ", caracter);
        
        System.out.println(text);
    }
}
