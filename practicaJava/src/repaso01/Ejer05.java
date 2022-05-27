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
 * 5.	Introducir la edad de una persona 
 *      e indicar si es mayor de edad
 * 
 *      15>=18 
 * 
 */
public class Ejer05 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.print("Ponga su edad: ");
        int edad = l.nextInt();//
        if (edad>=18) {
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
}
