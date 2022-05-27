/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso01;

/**
 *
 * @author ERIK
 * 
 * 3.	Intercambiar el contenido de dos variables
 */
public class Ejer03 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int aux=0;
        aux = a;//5
        a=b;//2
        b=aux;//5
        System.out.println(a);
        System.out.println(b);
    }
}
