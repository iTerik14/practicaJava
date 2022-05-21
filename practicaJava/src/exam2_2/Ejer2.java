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
public class Ejer2 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = l.nextLine(); //
        String [] cad = frase.split(" ");// el paralelepipedo es diferente al retangulo
        int c=0,c1=0;
        for (int i = 0; i < cad.length; i++) {
            String cad1 [] = cad[i].split("");//[e,l]
            for (int j = 0; j < cad1.length; j++) {//1 14
                if (cad1[j].equals("a")) {//==
                    c++;//1 2
                }
                if (cad1[j].equals("e")) {//==
                    c++; //1 3 4 6 
                }
                if (cad1[j].equals("i")) {//==
                    c++;// 5
                }
                if (cad1[j].equals("o")) {//==
                    c++;// 7
                }
                if (cad1[j].equals("u")) {//==
                    c++;
                }
            }
            if (c>3) {
                c1++;//1 2 3
            }
            c=0;
        }
        System.out.println(c1+" palabras tienen mas de 3 vocales");
    }
}
