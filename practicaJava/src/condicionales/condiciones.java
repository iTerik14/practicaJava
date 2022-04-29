/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author ERIK
 */
public class condiciones {

    public static void main(String[] args) {
        int edad;
        Scanner e = new Scanner(System.in);
        System.out.print("introduzca su edad: ");
        edad = e.nextInt();
        
        if (edad >= 18) {
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("no eres mayor de edad");
        }
        
    }
}
