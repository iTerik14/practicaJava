/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9;

import java.util.Scanner;

/**
 *
 * @author Pc26
 * 
 *  invertir una cadena
 */
public class _03_Ejemplo {
    public static void main(String[] args) {
        String cadena, aux="";
        System.out.println("ingresar una cadena o frase");
        Scanner p = new Scanner(System.in);
        cadena=p.nextLine();
        for (int i = cadena.length()-1; i >= 0; i--) {
            aux=aux+cadena.charAt(i);
        }
        System.out.println("la cadena o frase invertida es "+aux);
    }
}
