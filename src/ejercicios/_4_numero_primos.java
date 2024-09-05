package ejercicios;

public class _4_numero_primos {

        public static boolean esPrimo(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    return false; //
                }
            }
            return true;
        }
        public static void main(String[] args) {
            int numero = 29;
            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }
}

