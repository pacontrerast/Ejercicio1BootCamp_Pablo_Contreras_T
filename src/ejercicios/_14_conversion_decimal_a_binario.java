package ejercicios;

public class _14_conversion_decimal_a_binario {
    /*
    * 14. Conversión de decimal a binario
•	Descripción: Dado el número decimal a = 45, conviértelo a binario.
•	Variables: a = 45.
    * */

        public static void main(String[] args) {
            int a = 45;     // variable a convertir
            int x = a;      // variable solo para mostrar en resultado
            String binario = "";

            // Convertir el número decimal a binario
            while (a > 0) {
                int residuo = a % 2;
                binario = residuo + binario;
                a = a / 2;
            }

            // Imprimir
            System.out.println("El número decimal de "+x);
            System.out.println("en binario es: " + binario);
        }
    }



