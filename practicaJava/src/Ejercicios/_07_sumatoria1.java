package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author ERIK
 *
 * 7. Calcular la sumatoria de los N primeros naturales 
 *      S=1+2+3+4+5+6+………..+N
 *
 * for suma
 *
 */
public class _07_sumatoria1 {

    public static void main(String[] args) {
        int n; //entero
        int suma = 0; //acumulador
        Scanner e = new Scanner(System.in);
        System.out.print("introduzca un numero n: ");
        n = e.nextInt();
                           //7
        for (int i = 1; i <= n; i++) { // i = 1 2 3 4 5 6 7 8
            suma += i; // suma = suma + i;
            System.out.print(suma+"+");
        }
        System.out.println(" ");
        System.out.println("la suma es "+suma);
    }
}

//  suma = 1,3,6,10,15,21,28
