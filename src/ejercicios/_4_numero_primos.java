package ejercicios;

public class _4_numero_primos {

        public static void main(String[] args) {
            int a = 29;
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                System.out.println(a + " es un número primo.");
            } else {
                System.out.println(a + " no es un número primo.");
            }
        }
}
