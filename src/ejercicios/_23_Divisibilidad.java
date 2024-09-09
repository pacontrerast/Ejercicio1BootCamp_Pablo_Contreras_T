package ejercicios;

public class _23_Divisibilidad {
    /*
    * Divisibilidad
•	Descripción: Dado el número a = 45, determina si es divisible por 2, 3 o 5. Un número es divisible por otro si al dividir el resultado es un número entero sin resto.
•	Variables: a = 45.
    * */
    public static void main(String[] args) {
        int numero = 45;

        // Comprobar divisibilidad por 2
        if (numero % 2 == 0) {
            System.out.println(numero + " es divisible por 2.");
        } else {
            System.out.println(numero + " no es divisible por 2.");
        }
        // Comprobar divisibilidad por 3
        if (numero % 3 == 0) {
            System.out.println(numero + " es divisible por 3.");
        } else {
            System.out.println(numero + " no es divisible por 3.");
        }

        // Comprobar divisibilidad por 5
        if (numero % 5 == 0) {
            System.out.println(numero + " es divisible por 5.");
        } else {
            System.out.println(numero + " no es divisible por 5.");
        }
    }
}
