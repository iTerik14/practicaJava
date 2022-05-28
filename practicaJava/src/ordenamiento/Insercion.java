/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

/**
 *
 * @author ERIK
 */
public class Insercion {

    public static void main(String[] args) {
        int j = 0;
        int actual = 0;
        int v[] = {8, 5, 2, 4, 7, 9, 3, 1, 6};
        for (int i = 0; i < v.length; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");
        System.out.println("\n***ORDENANDO***");
        
        for (int i = 1; i < v.length; i++) {
            j = i;
            actual = v[j];
            while ((j > 0) && (v[j - 1] > actual)) {
                v[j] = v[j - 1];
                j--;
            }
            v[j] = actual;
            
            System.out.print("["+i+"] » ");
            for (int h = 0; h < v.length; h++) {
                System.out.print(" " + v[h]);
            }
            System.out.println("");
        }
        
        System.out.println("\n***ORDENADO***");
        for (int i = 0; i < v.length; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");
    }
}
