package condicionales;

import java.util.Scanner;

/**
 *
 * @author ERIK
 */
public class Condicional2 {

    //como saber si un numero es par o impar
    public static void main(String[] args) {

        int num;
        Scanner e = new Scanner(System.in);
        System.out.print("introduzca un numero: ");
        num = e.nextInt();

        // 2 4 6 8 10
        // 1 3 5 7 9
        // 4/2=2 % 0
        // 7/2=3 % 1
        
        if (num % 2 == 0) {
            System.out.println("soy un numero par");
        } else {
            System.out.println("soy un numero impar");
        }
    }
}
