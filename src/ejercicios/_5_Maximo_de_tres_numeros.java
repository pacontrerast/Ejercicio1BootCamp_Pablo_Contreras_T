package ejercicios;

public class _5_Maximo_de_tres_numeros {
        public static void main(String[] args) {
            int a = 5, b = 12, c = 9;
            int maximo;
            if (a >= b && a >= c) {
                maximo = a;
            } else if (b >= a && b >= c) {
                maximo = b;
            } else {
                maximo = c;
            }
            System.out.println("El número más grande es: " + maximo);
        }
    }
