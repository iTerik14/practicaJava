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
 * 2.	Calcular el área de un triángulo
 *      area = (base * altura) / 2;
 */
public class Ejer2 {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        //area = base y altura.
        int area = 0;
        System.out.print("introduzca la base: ");
        int b = lee.nextInt();
        System.out.print("introduzca la altura: ");
        int a = lee.nextInt();
        
        area = (b*a)/2;
        
        System.out.println("el area del triangulo es: "+area);
    }
}
