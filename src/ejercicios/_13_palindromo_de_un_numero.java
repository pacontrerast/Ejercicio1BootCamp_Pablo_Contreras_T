package ejercicios;

public class _13_palindromo_de_un_numero {
    /*
    * 13.Palíndromo de un número
•	Descripción: Determina si el número a = 1221 es palíndromo, es decir, si se lee igual de izquierda a derecha que de derecha a izquierda.
•	Variables: a = 1221.
    * */

        public static void main(String[] args) {
            int numero = 1221;
            int original = numero;
            int invertido = 0;
            while (numero != 0) {
                int digito = numero % 10;
                invertido = (invertido * 10) + digito;
                numero = numero / 10;
            }
            // comparacion de numero
            if (original == invertido) {
                System.out.println(original + " es un palíndromo.");
            } else {
                System.out.println(original + " no es un palíndromo.");
            }
        }

}
