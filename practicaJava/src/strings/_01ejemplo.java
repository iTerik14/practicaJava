package Cadenas;

public class _01ejemplo {

    public static void main(String[] args) {
        String cadena = "Informatica industrial";
        //MEtod length();
        System.out.println("la Cadena  " + " ' " + cadena + " ' tiene  "
                + cadena.length() + " caracteres "
        );
        //metodo indexof(),tolowerCase() y to UpperCase()
        int index1 = cadena.indexOf("ca", 9);
        int index2 = cadena.indexOf("tica");
        System.out.println(index1);
        System.out.println(index2);
        System.out.println(cadena.toLowerCase());
        System.out.println(cadena.toUpperCase());

        String cadena1 = "Informatica";
        String cadena2 = "Informatica";
        String cadena3 = "Industrial";
        System.out.println(cadena1.compareTo(cadena2));
        System.out.println(cadena2.compareTo(cadena1));
        System.out.println(cadena1.compareTo(cadena3));
        System.out.println(cadena3.compareTo(cadena1));

    }

}
