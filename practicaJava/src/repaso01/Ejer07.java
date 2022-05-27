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
 *  7.	Sumar los divisores de un número N = 5
 *      1 2 3 4 5 
 */
public class Ejer07 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int suma=0; // suma = suma+i = 1
        int n = l.nextInt();
        
        for (int i = 1; i <= n; i=i+1) { //1 2 3 4 5 6
            if (n%i==0) {
                suma = suma+i;// 1+5
                System.out.println(i);
            }
        }
        
        System.out.println("la suma de los divisores de "+n+" es "+suma);
    }
}
