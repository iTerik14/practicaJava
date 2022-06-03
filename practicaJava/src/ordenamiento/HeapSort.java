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
public class HeapSort {

    public static void main(String[] args) {
        int v[] = {3, 9, 7, 0};//9
        for (int i = 0; i < v.length; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");
        System.out.println("\n***ORDENANDO***");
        int i = 0, p = 0;
        int n = v.length - 1;//3
        int posPadre = 0;
        int aux = 0;
        int hijoDer = 0;
        int hijoIzq = 0;
        while (n >= 0) {
            posPadre = (n - 1) / 2;//1
            for (int j = posPadre; j >= 0; j--) {
                hijoIzq = (2 * j) + 1;//3
                hijoDer = (2 * j) + 2;//4

                
                if ((hijoIzq <= n) && (v[hijoIzq] > v[j])) {
                    aux = v[hijoIzq];
                    v[hijoIzq] = v[j];
                    v[j] = aux;
                }
                if ((hijoDer <= n) && (v[hijoDer] > v[j])) {
                    aux = v[hijoDer];
                    v[hijoDer] = v[j];
                    v[j] = aux;
                }
            }
            aux = v[0];
            v[0] = v[n];
            v[n] = aux;
            n = n - 1;

            System.out.print("[" + p + "] » ");
            for (int h = 0; h < v.length; h++) {
                System.out.print(" " + v[h]);
            }
            p++;
            System.out.println("");
        }

        System.out.println("\n***ORDENADO***");
        for (int k = 0; k < v.length; k++) {
            System.out.print(" " + v[k]);
        }
        System.out.println("");

    }
}
