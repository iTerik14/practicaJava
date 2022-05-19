package boletin_string;

import java.util.Scanner;

/**
 *
 * @author ERIK

 *   Crear un programa que lea por teclado una cadena, y muestre la siguiente
 *   información:
 *
 * - Imprima los dos primeros caracteres. 
 * - Imprima los tres últimos caracteres. 
 * - Imprima dicha cadena cada dos caracteres. Ej.: recta debería imprimir rca 
 * - Dicha cadena en sentido inverso. Ej.: hola mundo! debe imprimir !odnum aloh 
 * - Imprima la cadena en un sentido y en sentido inverso. Ej: reflejo imprime 
 *   reflejoojelfer.
 */
public class _01_ejer {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String texto = l.nextLine();
        System.out.println(primer(texto));
        System.out.println(segundo(texto));
        tercero(texto);
        cuarto(texto);
        quinto(texto);
    }
    
    public static String primer(String texto){
        String text=texto.trim().substring(0,2);
        return text;
    }
    
    public static String segundo(String texto){
        texto=texto.trim();
        String text = texto.substring(texto.length()-3,texto.length());
        return text;
    }
    
    public static void tercero(String texto){
        String text="";
        for (int i = 0; i < texto.length(); i=i+2) {
            System.out.print(texto.charAt(i));
        }
        System.out.println("");
    }
    
    public static void cuarto(String texto){
        StringBuilder l = new StringBuilder(texto);
        l = l.reverse();
        System.out.println(l.toString());
    }
    
    public static void quinto(String texto){
        StringBuilder l = new StringBuilder(texto);
        l = l.reverse();
        System.out.println(texto+l.toString());
    }
}
