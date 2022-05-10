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
 * dada una cadena, contar los caracteres repetidos continuos.
 *
 */
public class _02_strings {

    public static void main(String[] args) {
        String texto;   //  0 1 2 3 // holaaa
        char [] texto2; // []
        char car = 0;
        int cont = 0;
        Scanner m = new Scanner(System.in);
        texto = m.nextLine();  //HolaAa / holaaa= [h,o,l,a,a,a]
        String texto1 = texto.toLowerCase(); // todo minuscula
        texto2 = texto1.toCharArray(); // array [h,o,l,a,a,a] 6
                                               //0 1 2 3 4 5
        for (int i = 0; i < texto2.length ; i++) { // 1
            car = texto2[i]; // [h,o,l,a,a,a]
            for (int j = 0; j < texto2.length; j++) {
                if (car == texto2[j]){
                    cont++; //1 2 3
                }
            }
            System.out.println(texto2[i]+" se repite " + cont+" veces");
            cont=0;
        }
        

    }
}
