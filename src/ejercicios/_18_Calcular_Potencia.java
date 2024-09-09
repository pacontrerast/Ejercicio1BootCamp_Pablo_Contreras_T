package ejercicios;

public class _18_Calcular_Potencia {
/*
* Calcular potencia
•	Descripción: Dado el número a = 2 y la potencia b = 8, calcula , es decir, 2 elevado a la potencia de 8.
•	Variables: a = 2, b = 8.
* */

        public static void main(String[] args) {
            int a = 2;  // Base
            int b = 8;  // Exponente
            int resultado = 1;

            // se usa FOR para recorrer
            for (int i = 1; i <= b; i++) {
                resultado = resultado * a;  // Multiplicar el resultado actual por la base
            }
            // Imprimir el resultado de a elevado a la potencia de b
            System.out.println("Calcular Potencia");
            System.out.println("Un numero "+a+" elevado a la potencia de "+b);
            System.out.println("da como resultado: " + resultado);
        }


}
