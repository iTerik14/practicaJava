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
public class Seleccion {

    public static void main(String[] args) {
        int v[] = {5, 8, 2, 4, 7, 9, 3, 1, 0, 6};
        for (int i = 0; i < v.length; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");
        int aux = 0;
        int posMen = 0;
        int round = 0;
        for (int i = 0; i < v.length - 1; i++) {
            posMen = i;
            for (int j = i + 1; j < v.length; j++) {
                if (v[posMen] > v[j]) {
                    posMen = j;
                }
            }
            aux = v[posMen];
            v[posMen] = v[i];
            v[i] = aux;

            for (int h = 0; h < v.length; h++) {
                System.out.print(" " + v[h]);
            }
            System.out.println("");
        }
        for (int i = 0; i < v.length; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");
    }
}
