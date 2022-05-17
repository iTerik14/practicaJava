/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

import java.util.Scanner;

/**
 *
 * @author ERIK
 * 
 * v1=[1,5,7,8,9,0]//6 3
 * v2=[1,5,7,200,8,9,0]//200 6+1//3.5
 * 
 */
public class Ejer3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ponga el tamaño del vector");
        int num = leer.nextInt();
        int v[] = llenarVector(num);
        int v2 []=new int[num+1];
        int h = leer.nextInt();
        for (int i = 0; i < v.length; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");
        int a=0;
        for (int i = 0; i < v2.length; i++) {//
            if (i == v.length / 2) { //3
                v2[i]=h;//200
            }else{
                v2[i]=v[a];
                a++;
            }
            System.out.print(" " + v2[i]);
        }
        System.out.println("");
    }

    public static int[] llenarVector(int n) {
        int v[] = new int[n];//6
        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 20);
        }
        return v;//v=[1,5,7,8,9,0]
    }
}
