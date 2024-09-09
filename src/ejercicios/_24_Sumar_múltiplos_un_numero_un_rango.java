package ejercicios;

public class _24_Sumar_múltiplos_un_numero_un_rango {
    /*
    Sumar los múltiplos de un número en un rango
•	Descripción: Suma todos los múltiplos de a = 3 dentro del rango de 1 a 50. Un múltiplo de un número es el resultado de multiplicarlo por un entero.
•	Variables: a = 3, rango de 1 a 50.
    * */
        public static void main(String[] args) {
            int a = 3;
            int rangoFinal = 50;
            int suma = 0;

            for (int i = 1; i <= rangoFinal; i++) {
                if (i % a == 0) {
                    suma += i;
                }
            }

            System.out.println("La suma de los múltiplos de " + a + " entre 1 y " + rangoFinal + " es: " + suma);
        }
}
