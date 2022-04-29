package fundamentos;

import java.util.Scanner;

/**
 *
 * @author ERIK
 */
public class Asignacion {

    public static void main(String[] args) {
        int a, b=0;
        Scanner e = new Scanner(System.in);
        System.out.println("introduzca un numero: ");
        a = e.nextInt();
        System.out.println("El numero es: " + a);
        
        b=a; //asignacion
        System.out.println("valor de b: "+b);
        
        b=a+5;
        System.out.println("valor de b: "+b);
        
        b=b+a;
        System.out.println("valor de b: "+b);
        
        
    }
}
