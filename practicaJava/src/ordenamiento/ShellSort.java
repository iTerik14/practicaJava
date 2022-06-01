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
public class ShellSort {

    public static void main(String[] args) {

        int v[] = {8, 5, 2, 4, 7, 9, 3, 1, 6};
        shell(v);

        System.out.println("\n***ORDENADO***");
        for (int i = 0; i < v.length; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");
    }

    public static int[] shell(int[] arreglo) {
        int inter, i, aux, p = 0;
        boolean band;
        inter = arreglo.length;
        while (inter > 0) {
            inter = inter / 2;
            band = true;
            while (band) {
                band = false;
                i = 0;
                while ((i + inter) <= arreglo.length - 1) {//2.1.1
                    if (arreglo[i] > arreglo[i + inter]) {
                        aux = arreglo[i];
                        arreglo[i] = arreglo[i + inter];
                        arreglo[i + inter] = aux;
                        band = true;
                    }
                    i = i + 1;
                }

            }
            System.out.print("[" + p + "] » ");
            for (int h = 0; h < arreglo.length; h++) {
                System.out.print(" " + arreglo[h]);
            }
            p++;
            System.out.println("");
        }

        return arreglo;
    }
}
