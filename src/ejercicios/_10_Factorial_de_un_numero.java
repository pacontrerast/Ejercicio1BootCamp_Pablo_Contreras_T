package ejercicios;

public class _10_Factorial_de_un_numero {
        public static void main(String[] args) {
            int a = 6;
            int factorial = 1;
            for (int i = 1; i <= a; i++) {
                factorial = factorial * i;
            }
            System.out.println("El factorial de " + a + " es: " + factorial);
        }

}
