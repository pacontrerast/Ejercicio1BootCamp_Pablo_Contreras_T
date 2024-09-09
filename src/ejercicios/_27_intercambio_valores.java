package ejercicios;

public class _27_intercambio_valores {
    /* Intercambio de valores
•	Descripción: Intercambia los valores de a = 5 y b = 10 sin usar una tercera variable auxiliar.
•	Variables: a = 5, b = 10.
*/
        public static void main(String[] args) {
            int a = 5;
            int b = 10;
            System.out.println(".       Valores iniciales       .");
            System.out.println("Valores: ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            // Intercambio de valores
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println(".       Valores intercambiados       .");
            System.out.println("Valores: ");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }

}
