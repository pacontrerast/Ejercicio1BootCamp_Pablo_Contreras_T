package ejercicios;

public class _17_suma_numeros_pares_un_rango {
/*
*Suma de números pares en un rango
•	Descripción: Suma todos los números pares entre a = 1 y b = 100. Un número es par si es divisible por 2.
•	Variables: a = 1, b = 100.
* */
        public static void main(String[] args) {
            int a = 1, b = 100;
            int suma = 0;

            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    suma = suma + i;
                }
            }
            System.out.println("La suma de los números pares");
            System.out.println("Entre "+a+" y "+b);
            System.out.println("Da como resultado: " + suma);
        }
}
