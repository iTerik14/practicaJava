package ordenamiento;

/**
 *
 * @author ERIK
 *
 * Metodo Burbuja
 */
public class Burbuja {

    public static void main(String[] args) {
        int v[] = {5, 8, 2, 4, 7, 9, 3, 1, 0, 6};
        for (int i = 0; i < v.length; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");
        boolean ord=false;
        int aux = 0;
        int rondas = 0;
        while(!ord){
            ord=true;
            for (int j = 0; j < v.length - 1-rondas; j++) {
                if (v[j] > v[j + 1]) {
                    aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                    ord=false;
                }
            }
            rondas++;
            for (int h = 0; h < v.length; h++) {
                System.out.print(" " + v[h]);
            }
            System.out.println("");
        }

        for (int i = 0; i < v.length; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println("");
    }
}
