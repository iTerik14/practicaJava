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
public class QuickSort {

    public static void main(String[] args) {
        int v[] = {1, 5, 4, 8, 6, 3, 2, 9, 7};
        for (int i = 0; i < v.length; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");

        quicksort(v, 0, v.length - 1);

        System.out.println("**ORDENADO**");

        for (int i = 0; i < v.length; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");
    }

    public static void quicksort(int A[], int izq, int der) {

        int pivote = A[izq]; // tomamos primer elemento como pivote
        int i = izq;         // i realiza la búsqueda de izquierda a derecha
        int j = der;         // j realiza la búsqueda de derecha a izquierda
        int aux;

        while (i < j) {                          // mientras no se crucen las búsquedas                                   
            while (A[i] <= pivote && i < j) {
                i++; // busca elemento mayor que pivote
            }
            while (A[j] > pivote) {
                j--;           // busca elemento menor que pivote
            }
            if (i < j) {                        // si no se han cruzado                      
                aux = A[i];                      // los intercambia
                A[i] = A[j];
                A[j] = aux;
            }
        }

        A[izq] = A[j];      // se coloca el pivote en su lugar de forma que tendremos                                    
        A[j] = pivote;      // los menores a su izquierda y los mayores a su derecha

        if (izq < j - 1) {
            quicksort(A, izq, j - 1);          // ordenamos subarray izquierdo
        }
        if (j + 1 < der) {
            quicksort(A, j + 1, der);          // ordenamos subarray derecho
        }
    }

    //Metodo de ordenamineto Quick Sort
    static void quicksor(int arreglo[], int primero, int ultimo) {
        int central, i, j;
        int pivote;
        central = (primero + ultimo) / 2;
        pivote = arreglo[central];
        i = primero;
        j = ultimo;
        do {
            while (arreglo[i] < pivote) {
                i++;
            }
            while (arreglo[j] > pivote) {
                j--;
            }
            if (i <= j) {
                int temp;
                temp = arreglo[i];
                arreglo[i] = arreglo[j];
                /*intercambia A[i] con A[j] */
                arreglo[j] = temp;
                i++;
                j--;
            }
        } while (i <= j);

        if (primero < j) {
            quicksort(arreglo, primero, j);
            /*mismo proceso con sublista izquierda*/
        }
        if (i < ultimo) {
            quicksort(arreglo, i, ultimo);
            /*mismo proceso con sublista derecha*/
        }
    }

    public static void quick_srt(int array[], int low, int n) {
        int lo = low;
        int hi = n;
        if (lo >= n) {
            return;
        }
        int mid = array[(lo + hi) / 2];
        while (lo < hi) {
            while (lo < hi && array[lo] < mid) {
                lo++;
            }
            while (lo < hi && array[hi] > mid) {
                hi--;
            }
            if (lo < hi) {
                int T = array[lo];
                array[lo] = array[hi];
                array[hi] = T;
            }
        }
        if (hi < lo) {
            int T = hi;
            hi = lo;
            lo = T;
        }
        quick_srt(array, low, lo);
        quick_srt(array, lo == low ? lo + 1 : lo, n);
    }

}
