package ejercicios;

public class _28_calcular_MCD {
    /*Calcular el máximo común divisor (MCD)
•	Descripción: Dados los números a = 48 y b = 18, calcula su MCD (máximo común divisor). El MCD es el número más grande que divide exactamente a ambos números.
•	Variables: a = 48, b = 18.
*/
        public static void main(String[] args) {
            int a = 48;
            int b = 18;
            int x=a;
            int y=b;

            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }

            System.out.println("El MCD de " +x+ " y " +y+ " es: " + a);
//            System.out.println(a);
//            System.out.println(b);
        }
}
