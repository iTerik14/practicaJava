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
 * 6.	Determinar si un número N es múltiplo de 7.
 *      N%7 == 0
 */
public class Ejer06 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.print("Ponga un numero: ");
        int N = l.nextInt();//
        if (N%7==0) { // 15/7 = 2 = 1
            System.out.println(N+" es multiplo de 7");
        }else{
            System.out.println(N+ " no es multiplo de 7");
        }
    }
}
