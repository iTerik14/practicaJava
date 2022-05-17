/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

import java.util.Scanner;

/**
 *
 * @author ERIK
 */
public class Ejer1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ponga una cadena");
        String fil = leer.nextLine();
        String[] cadena;
        cadena = fil.split("");
        String cadena2 = "";
        for (String cadena1 : cadena) {
            if (cadena1.equals("o")) {
                cadena2 += cadena1 + "u";
            } else if (cadena1.equals("e")) {
                cadena2 += cadena1 + "i";
            } else {
                cadena2 += cadena1;
            }
        }
        System.out.println(cadena2);
        int k = leer.nextInt();
        String[] cadena3 = cadena2.split("");//[f,o,u,r..]
        int partes = cadena3.length/k;//15/5=3
        String cadena4;
        int j = 0, u = k;
        for (int i = 0; i < partes; i++) {
            cadena4 = cadena2.substring(j, u);
            System.out.println(cadena4);
            u += k;
            j+=k;
        }
    }
}
