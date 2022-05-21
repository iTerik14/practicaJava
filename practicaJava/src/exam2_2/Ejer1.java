/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2_2;

import java.util.Scanner;

/**
 *
 * @author ERIK
 */
public class Ejer1 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String cadena = l.nextLine(); // hola mundo estados
        String texto[] = cadena.split("o");// [hola,mundo,estados]
        String t = "";
        int tmayor = 0;
        for (int i = 0; i < texto.length; i++) {//1 2 3
            if (i==0) {
                tmayor = texto[i].length();//4
                t = texto[i];
            }else{
                if (texto[i].length()>tmayor) {
                    tmayor = texto[i].length();//5 7
                    t = texto[i];//estados
                }
            }
        }
        System.out.println(t+" tiene "+tmayor+" caracteres");
    }
}
