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
        int vector[] = {8, 5, 2, 4, 7, 9, 3, 1, 6};//9
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i]);
        }
        System.out.println("");
        System.out.println("\n***ORDENANDO***");

        for (int i = 1; i < vector.length; i = i + 1) {//1 2 3 4 5
            actual = vector[i];//
            for (j = i; (j > 0) && (vector[j - 1] > actual); j--) {
                vector[j] = vector[j - 1];
            }
            vector[j] = actual;

            
            
            System.out.print("[" + i + "] » ");
            for (int h = 0; h < vector.length; h++) {
                System.out.print(" " + vector[h]);
            }
            System.out.println("");
        }

        System.out.println("\n***ORDENADO***");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(" " + vector[i]);
        }
        System.out.println("");
    }
}
