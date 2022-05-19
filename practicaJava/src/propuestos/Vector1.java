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
        String[] vec = {"mario", "juanes", "pablo", "martin", "marto"};
        String[] ve = new String[vec.length];
        for (int i = 0; i < vec.length; i++) {
            ve[i] = vec[i].replace("o", "a");
        }

        for (String ve1 : ve) {
            System.out.print(ve1 + " ");
        }
        System.out.println("");
    }
}
