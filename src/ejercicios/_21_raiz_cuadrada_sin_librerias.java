package ejercicios;

public class _21_raiz_cuadrada_sin_librerias {
    /*
* Raíz cuadrada sin usar librerías
•	Descripción: Calcula la raíz cuadrada del número a = 49 sin usar funciones predefinidas. La raíz cuadrada de 49 es 7.
•	Variables: a = 49.
*/

        public static void main(String[] args) {
            double a = 49;
            double epsilon = 0.000001; // Tolerancia
            double low = 0;
            double high = a;

            while (high - low > epsilon) {
                double mid = (low + high) / 2;
                if (mid * mid > a) {
                    high = mid;
                } else {
                    low = mid;
                }
            }
            System.out.println("La raíz cuadrada de " + a + " es aproximadamente: " + (low + high) / 2);
        }
}
