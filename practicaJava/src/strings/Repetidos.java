/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author ERIK
 * 
 * 
 *      dada una cadena, contar los caracteres repetidos continuos.
 */
public class Repetidos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String cadena = "hola soy un texto";
        StringBuilder a = new StringBuilder(cadena);
        String cad = cadena;
        System.out.println(cadena);
        System.out.println(cad);
    }    
}
