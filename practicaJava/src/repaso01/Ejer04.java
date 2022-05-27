/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso01;

import java.util.Scanner;

/**
 *
 * @author ERIK
 * 
 * 4.	Hallar el promedio de cinco notas
 *      n1,n2,n3,n4 y n5
 *      (n1+n2+n3+n4+n5)/5
 */
public class Ejer04 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int prom = 0;
        System.out.println("Introduzca las notas");
        int n1 = l.nextInt();
        int n2 = l.nextInt();
        int n3 = l.nextInt();
        int n4 = l.nextInt();
        int n5 = l.nextInt();
        prom = (n1+n2+n3+n4+n5)/5;
        System.out.println("El promedio es: "+prom);
    }
}
