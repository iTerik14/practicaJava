package Ejercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author ERIK
 *
 * 10. calcular la productoria de los N primeros numeros naturales
 *
 * p = 1*-2*3*4*5*6*7*8......*N;
 */
public class _10_productoria {

    public static void main(String[] args) {
        int n; //entero
        double prod = 1; //acumulador 
        //Scanner e = new Scanner(System.in);
        //System.out.print("introduzca un numero n: ");
        // n = e.nextInt();
        n = Integer.parseInt(JOptionPane.showInputDialog("ponga un numero: "));
        
                           //5
        for (int i = 1; i <= n; i++) { // i = 1 2 3 4 5 6
            
            prod = prod * i;
            
            System.out.print(prod + "*");
        }
        
        System.out.println(" ");
        System.out.println("el producto es " + prod);
    }
}

// 5! = 1*2*3*4*5
// prod = 1 2 6 24 120
