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
public class ShellSort_propio {

    public static void main(String[] args) {
        int salto = 0, p = 0;
        int j = 0;
        int actual = 0;    //  4
        int v[] = {8, 5, 2, 4, 7, 9, 3, 1, 6};//9
        for (int i = 0; i < v.length; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");
        System.out.println("\n***ORDENANDO***");

        salto = v.length - 1;
        salto = salto / 2;//2
        while (salto > 0) {

            for (int i = salto; i < v.length; i = i + salto) {
                actual = v[i];//2
                for (j = i; (j > 0) && (v[j - salto] > actual); j = j - salto) {
                    v[j] = v[j - salto];
                }
                v[j] = actual;

            }
            //  6, 5, 2, 4, 7, 9, 3, 1, 8
            //
            System.out.print("[" + p + "] » ");
            for (int h = 0; h < v.length; h++) {
                System.out.print(" " + v[h]);
            }
            p++;
            System.out.println("");

            salto = salto / 2;//2

        }
        System.out.println("\n***ORDENADO***");
        for (int i = 0; i < v.length; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");
    }
}
