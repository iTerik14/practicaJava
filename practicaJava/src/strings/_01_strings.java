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
 *  dada una frase, invertir la frase.
 * 
 */
public class _01_strings {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        String inv="";
        String texto = m.nextLine();
        String[] invert = texto.split(" ");
        for (int i=invert.length-1;i>=0;i--) {
            inv+=invert[i]+" ";
        }
        System.out.println(inv);
    }
}
