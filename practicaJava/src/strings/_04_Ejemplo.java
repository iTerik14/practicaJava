/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author Pc26
 */
public class _04_Ejemplo {
    public static void main(String[] args) {
        String cadena, aux="";
        String[] palabras;
        System.out.println("ingresar una cadena o frase");
        Scanner p = new Scanner(System.in);
        cadena=p.nextLine();
        palabras = cadena.split(" "); //[hola,mundo,como,estas]
        int a = palabras.length;
        System.out.println("la frase tiene "+a+" palabras");
    }
}
