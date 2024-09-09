package ejercicios;

public class _26_valor_absoluto {
    /*
    * Valor absoluto
•	Descripción: Determina el valor absoluto del número a = -15. El valor absoluto es la distancia de un número al 0, ignorando su signo.
•	Variables: a = -15.
    * */
        public static void main(String[] args) {
            int numero = -15;
            int valorAbsoluto = numero < 0 ? -numero : numero;

            System.out.println("El valor absoluto de " + numero + " es: " + valorAbsoluto);
        }
}
