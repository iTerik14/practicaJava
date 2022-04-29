package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author ERIK
 *
 * 6. Sumar los divisores de un número N
 *      15 % 15 = 1  0
 *      15 % 5  = 3  0
 *      15 % 3  = 5  0
 *      15 % 1  = 15 0
 *          24
 * 
 *      1 4 9
 */
public class _06_sumaDivisores {

    public static void main(String[] args) {
        int n;
        int suma=0;
        Scanner e = new Scanner(System.in);
        System.out.print("introduzca un numero n: ");
        n = e.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                suma = suma+i;
            }
        }
        System.out.println("la suma es: "+suma);
    }
}               
