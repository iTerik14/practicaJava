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
 * dada una cadena, contar los caracteres repetidos continuos.
 */
public class Repetidos {

    public static void main(String[] args) {
        String cadena = "hohhallee";
        String cadena2 = cadena.toLowerCase();
        String[] texto = cadena2.split("");
        int cont = 1;
        String car = "";
        for (int i = 0; i < texto.length; i++) {
            car = texto[i];
            for (int j = 0; j < texto.length; j++) {
                if (car.equals(texto[j])) {
                    if (texto[j].equals(texto[j+1])) {
                        cont++;
                    }
                }
            }
            if (cont>=2) {
                System.out.println(car+" "+cont);
            }
            cont=0;
        }
    }
}
