package ejercicios;

public class _4_numero_primos {
        public static void main(String[] args) {
            int numero = 29;
            boolean numeroPrimo = true;

            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    numeroPrimo = false;
                    break;
                }
            }

            if (numeroPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }



}

