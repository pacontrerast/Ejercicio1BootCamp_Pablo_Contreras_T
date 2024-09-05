package ejercicios;

public class _9_suma_primeros_N_numerosNaturales {
        public static void main(String[] args) {
            int N = 50;
            int suma = 0;
            for (int i = 1; i <= N; i++) {
                suma += i;
            }
            System.out.println("La suma de los primeros "+N);
            System.out.println("números naturales es: " + suma);
        }

}
