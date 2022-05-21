/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2_2;

import java.util.Scanner;

/**
 *
 * @author ERIK
 * 
 *  n = 7
 *  [0,5,0,1,8,0,9]
 *  a = 0
 *  b = 3
 */
public class Ejer3 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.print("Tamaño del vector: ");
        int n = l.nextInt();
        int v[] = new int[n];
        for (int i = 0; i < v.length; i++) {
            v[i]=(int) (Math.random()*10);// 1 - 10 [0,7,2,1,8,5,9]
        }
        
        for (int i = 0; i < v.length; i++) {
            System.out.print(" "+v[i]);
        }
        System.out.println(" ");
        
        int a = l.nextInt(); // a=1   aux=1
        int b = l.nextInt(); // b=5   a=5   b=1
        int aux=0;
        
        aux = v[a]; // 5
        v[a] = v[b]; //v[5]=7
        v[b] = aux;
        for (int i = 0; i < v.length; i++) {
            System.out.print(" "+v[i]);
        }
        System.out.println(" ");
    }
}
