package ejercicios;

public class _11_Fibonacci {
    public static void main(String[] args) {
        int N = 10;
        int num1 = 0, num2 = 1;
        System.out.println("==================");
        System.out.println("Serie de Fibonacci");
        System.out.print(num1 + " " + num2 + " ");


        for (int i = 2; i < N; ++i) {
            int suma = num1 + num2;
            System.out.print(suma + " ");
            num1 = num2;
            num2 = suma;
        }

    }

}
