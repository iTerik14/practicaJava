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
 *  1.	Calcular el área de un rectángulo
 */
public class Ejer01 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        //area = base y altura.
        int area = 0;
        System.out.print("introduzca la base: ");
        int b = lee.nextInt();
        System.out.print("introduzca la altura: ");
        int a = lee.nextInt();
        
        area = b*a;
        
        System.out.println("el area del rectangulo es: "+area);
    }
}
