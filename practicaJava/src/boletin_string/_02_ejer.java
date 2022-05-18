package boletin_string;

import java.util.Scanner;

/**
 *
 * @author ERIK
 *
 *
 *      Crear un programa que lea por teclado una cadena y un carácter, e inserte el
 *      carácter entre cada letra de la cadena. Ej: separar y , debería devolver
 *      s,e,p,a,r,a,r
 * 
 * 
 */
public class _02_ejer {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        String text = l.nextLine();
        String caracter = l.nextLine();
        String [] texto = text.split("");
        String pal = "";
        for(int i=0;i<texto.length;i++){
            if (i<texto.length-1) {
                pal=pal+texto[i]+caracter;
            }else{
                pal=pal+texto[i];
            }
        }
        System.out.println(pal);
        System.out.println(text.replace("", caracter));
    }
}
