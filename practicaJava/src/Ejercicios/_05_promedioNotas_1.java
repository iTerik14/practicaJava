package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author ERIK
 *
 * 5. Hallar el promedio de cinco notas
 *
 */
public class _05_promedioNotas_1 {

    public static void main(String[] args) {
        int n1,n2,n3,n4,n5,suma=0;
        float promedio=0;
        Scanner e = new Scanner(System.in);
        System.out.print("introduzca las 5 notas: ");
        n1 = e.nextInt();
        n2 = e.nextInt();
        n3 = e.nextInt();
        n4 = e.nextInt();
        n5 = e.nextInt();
        
        suma = n1+n2+n3+n4+n5;
        System.out.println("la suma "+suma);
        
        promedio = suma/5;
        System.out.println("el promedio es "+promedio);
    }
}
