/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

import java.util.Scanner;

/**
 *
 * @author ERIK
 * 
 *  introducir una cadena de caracteres  e indicar si es polindromo. otto == otto
 */
public class _03_stringss {
    
    public static void main(String[] args) {
        String invert = "";
        Scanner m = new Scanner(System.in);
        String texto = m.nextLine();  //otto
        String texto2 [] =texto.split(""); //[o,t,t,o] // 3 2 1 0
        for (int i = texto2.length-1; i >= 0; i--) {
            invert=invert+texto2[i]+""; //otto
        }
        if (texto.equals(invert)) {
            System.out.println(texto +" =? "+invert+" es polindromo");
        }else{
            System.out.println(texto +" =? "+invert+" no  es polindromo");
        }
        
    }
    
}
