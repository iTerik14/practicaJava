package strings;

/**
 *
 * @author ERIK
 *
 *
 * dada una cadena, contar los caracteres repetidos continuos.
 */
public class Repetidos {

    public static void main(String[] args) {
        String cadena = "aaabcccbbbaaccc";
        String cadena2 = cadena.toLowerCase();
        String[] texto = cadena2.split("");
        int cont = 1;
        String car = "";
        for (int i = 0; i < texto.length; i++) {
            car = texto[i];
            if (!(comp(texto, i))) {
                for (int j = i+1; j < texto.length-1; j++) {
                    if (car.equals(texto[j])) {
                        if (texto[j].equals(texto[j+1])) {
                            cont++;
                        }
                    }
                }
            }
            if (cont > 1) {
                System.out.println(car + " se repite " + cont);
            }
            cont = 1;
        }
    }

    public static boolean comp(String texto[], int y) {
        boolean a = false;
        for (int i = y-1; i >= 0; i--) {
            if (texto[y].equals(texto[i])) {
                return true;
            } else {
                a = false;
            }
        }
        return a;
    }
    public static boolean compAdel(String texto[], int y) {
        boolean a = false;
        for (int i = y; i < texto.length; i++) {
            if (texto[y].equals(texto[i])) {
                return true;
            } else {
                a = false;
            }
        }
        return a;
    }
}



