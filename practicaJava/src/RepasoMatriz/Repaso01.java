/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RepasoMatriz;

import java.util.Scanner;

/**
 *
 * @author ERIK
 */
public class Repaso01 {
    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in);
        //int f = leer.nextInt();
        //int c = leer.nextInt();
                      //0 1 2 3 4
        int vector[] = {1,2,3,4,5};
        for (int i = 0; i < vector.length; i++) {
            int valor = vector[i];
            System.out.println("["+i+"] = "+ valor);
        }
    }
}
