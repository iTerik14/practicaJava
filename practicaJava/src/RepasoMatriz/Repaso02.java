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
public class Repaso02 {
    
    /*
        1 2 3 4
        5 6 7 8  2x4
    
        
        
    */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ponga la fila");
        int f = leer.nextInt();
        System.out.println("ponga la columna");
        int c = leer.nextInt();
        int a=2;// 2 4 6 8 10
        int matriz[][] = new int[f][c];
        for (int i = 0; i < f; i++) {//0 1
            for (int j = 0; j < c; j++) { //0 1 2 3 4
                matriz[i][j]=a;
                System.out.print("\t"+matriz[i][j]);
                a=a+2;//2 3 4 5
            }
            System.out.println(" ");
        }
    }
}
