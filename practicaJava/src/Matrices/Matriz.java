/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;

/**
 *
 * @author ERIK
 */
public class Matriz {

    public static void main(String[] args) {
        int n = 5;
        int m[][] = new int[n][n];
        int a = 0, b = n - 1;
        int g = 1, r = n-2;
        while (r >= g) {
            for (int i = a; i <= b; i++) {
                m[a][i] = r;
            }
            for (int i = a + 1; i <= b; i++) {
                m[i][b] = r;
            }
            for (int i = b - 1; i >= a; i--) {
                m[b][i] = r;
            }
            for (int i = b - 1; i >= a + 1; i--) {
                m[i][a] = r;
            }
            a=a+1;
            b=b-1;
            r--;
        }

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                System.out.print(" " + m[i][k]+"\t");
            }
            System.out.println("");
        }
    }
}
