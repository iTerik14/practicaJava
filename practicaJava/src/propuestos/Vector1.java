/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propuestos;

/**
 *
 * @author ERIK
 */
public class Vector1 {

    public static void main(String[] args) {
        String[] vec = {"maria", "maria", "pablo", "marton", "marta"};
        String[] ve = new String[vec.length];
        
        for (int i = 0; i < vec.length; i++) {
            ve[i] = vec[i].replace("o", "a");
        }
        
        for (int i = 0; i < vec.length; i++) {
            // cadenas
            System.out.print(vec[i] + " ");
        }
        System.out.println("");
        int cont=0;
        for (int i = 0; i < vec.length; i++) {
            if (vec[i].equals("maria")) {
                cont=cont+1;
            }
        }
        System.out.println("hay "+cont+" marias");
        
        
    }
}
