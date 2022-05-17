
package exam2;

import java.util.Scanner;

/**
 *
 * @author ERIK
 */
public class Ejer2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ponga una cadena");
        String num = leer.nextLine();//(59)-1-68547588
        String cel="";
        for (int i = 0; i < num.length(); i++) {//1 2 3 4 5
            switch (i) {
                case 0:
                    cel="("+num.charAt(i);//(5
                    break;
                case 1:
                    cel=cel+num.charAt(i)+")-";//(59)-
                    break;
                case 2:
                    cel=cel+num.charAt(i)+"-";//(59)-1-
                    break;
                default:
                    cel=cel+num.charAt(i);//(59)-1-68547588
                    break;
            }
        }
        System.out.println("el nuevo cel: "+cel);
    }
}
