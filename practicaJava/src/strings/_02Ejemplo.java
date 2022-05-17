
package strings;

import java.util.Scanner;


public class _02Ejemplo {

   
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena;
        char caracteres;
        int cnt=0;
        System.out.println("introdusir la cadena");
        Scanner lee = new Scanner(System.in);
        cadena= lee.nextLine();
        String cadMin = cadena.toLowerCase();
        for (int i = 0; i < cadMin.length(); i++) {
            caracteres = cadMin.charAt(i);
            switch(caracteres){
                case 'a' : cnt++; break;
                case 'e' : cnt++; break;
                case 'i' : cnt++; break;
                case 'o' : cnt++; break;
                case 'u' : cnt++; break;
            }
        }
        System.out.println("la cadena "+cadena+" tiene "+cnt+" vocales");
        
    }
    
}
