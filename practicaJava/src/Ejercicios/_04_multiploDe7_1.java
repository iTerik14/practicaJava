package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author ERIK
 *
 * 4. Determinar si un número N es múltiplo de 7.
 *
 * 14 / 7 = 2 14 % 7 = 0 21 % 7 = 0
 *
 */
public class _04_multiploDe7_1 {

    public static void main(String[] args) {
        int num,l;
        Scanner e = new Scanner(System.in);
        System.out.print("introduzca un numero: ");
        num = e.nextInt();
        System.out.print("introduzca el multiplo: ");
        l = e.nextInt();
        
        if (num % l == 0) {
            System.out.println(num+ " es multiplo de "+l);
        }else{
            System.out.println(num+ " no es multiplo de "+l);
        }
        
    }
}
