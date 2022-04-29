package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author ERIK
 *
 * 3. Intercambiar el contenido de dos variables a,b,aux.
 *
 *
 *
 */
public class _03_intercambio_1 {

    public static void main(String[] args) {
        int a, b, aux;
        Scanner e = new Scanner(System.in);
        System.out.print("introduzca dos numeros: ");
        a = e.nextInt();
        b = e.nextInt();

        System.out.print(" " + a);
        System.out.println(" " + b);

        aux = a;
        a = b;
        b = aux;

        System.out.print(" " + a);
        System.out.println(" " + b);
    }
}
