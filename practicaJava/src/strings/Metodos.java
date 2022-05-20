/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author ERIK
 */
public class Metodos {
    public static void main(String[] args) {
        // length()
        String cadena1 = "holaaa";
        System.out.println(cadena1.length());
        
        // indexOf()
        
        String cadena2 = "mundo hola";
        System.out.println(cadena2.indexOf("o"));
        
        
        //toLowerCase
        
        String cadena3 = "MUnDO";
        System.out.println(cadena3.toLowerCase());
        
        //toUpperCase()
        
        String cadena4 = "mundo";
        System.out.println(cadena4.toUpperCase());
        
        //trim
        
        String cadena5 = "     metodos  ";
        System.out.println(cadena5);
        System.out.println(cadena5.trim());
        
        // subString()
        
        String cadena6 = "strings";
        System.out.println(cadena6.substring(0,3));
        
        //equals() ==
        
        String a = "hola";
        String b = "hola";
        if (a.equals(b)) {
            System.out.println("√");
        }else{
            System.out.println("x");
        }
        
        
        
    }
}
