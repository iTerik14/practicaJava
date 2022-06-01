/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenamiento;

import java.util.Arrays;

/**
 *
 * @author ERIK
 */
public class QuickSort {
    
public static void main(String[] args) {
        int numeros[] = {1, 9, 23, 4, 55, 100, 1, 1, 23};
        System.out.println("Antes de QS: " + Arrays.toString(numeros));
        quicksort(numeros, 0, numeros.length - 1);
        System.out.println("Después de QS: " + Arrays.toString(numeros));
    }

    private static int particion(int arreglo[], int izquierda, int derecha) {
        // Elegimos el pivote, es el primero
        int pivote = arreglo[izquierda];
        // Ciclo infinito
        while (true) {
            // Mientras cada elemento desde la izquierda esté en orden (sea menor que el
            // pivote) continúa avanzando el índice
            while (arreglo[izquierda] < pivote) {
                izquierda++;
            }
            // Mientras cada elemento desde la derecha esté en orden (sea mayor que el
            // pivote) continúa disminuyendo el índice
            while (arreglo[derecha] > pivote) {
                derecha--;
            }
    /*
    Si la izquierda es mayor o igual que la derecha significa que no
    necesitamos hacer ningún intercambio
    de variables, pues los elementos ya están en orden (al menos en esta
    iteración)
    */
            if (izquierda >= derecha) {
                // Indicar "en dónde nos quedamos" para poder dividir el arreglo de nuevo
                // y ordenar los demás elementos
                return derecha;
            } else {//Nota: yo sé que el else no hace falta por el return de arriba, pero así el algoritmo es más claro
      /*
      Si las variables quedaron "lejos" (es decir, la izquierda no superó ni
      alcanzó a la derecha)
      significa que se detuvieron porque encontraron un valor que no estaba
      en orden, así que lo intercambiamos
      */
                int temporal = arreglo[izquierda];
                arreglo[izquierda] = arreglo[derecha];
                arreglo[derecha] = temporal;
      /*
      Ya intercambiamos, pero seguimos avanzando los índices una vez más
      */
                izquierda++;
                derecha--;
            }
            // El while se repite hasta que izquierda >= derecha
        }
    }


    // Divide y vencerás
    private static void quicksort(int arreglo[], int izquierda, int derecha) {
        if (izquierda < derecha) {
            int indiceParticion = particion(arreglo, izquierda, derecha);
            quicksort(arreglo, izquierda, indiceParticion);
            quicksort(arreglo, indiceParticion + 1, derecha);
        }
    }
}
