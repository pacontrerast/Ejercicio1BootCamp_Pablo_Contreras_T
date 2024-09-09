package ejercicios;

public class _29_cuadrado_perfecto {
    /*Verificar si un número es un cuadrado perfecto
•	Descripción: Determina si el número a = 64 es un cuadrado perfecto. Un cuadrado perfecto es un número que es el resultado de multiplicar un entero por sí mismo. En este caso, 8 × 8 = 64.
•	Variables: a = 64.

//1, 4, 9, 16, 25, 36, 49, 64, 81, 100, y así sucesivamente
*/
        public static void main(String[] args) {
            int num = 64;
            int i = 1;
            int suma = 0;
            while (suma < num) {
//                System.out.println("inicio");
//                System.out.println("num   "+num);
//                System.out.println("i     "+i);
//                System.out.println("suma  "+suma);
//                System.out.println("---");
                suma = suma + i;
                if (suma == num) {
//                    System.out.println("--------");
//                    System.out.println("if");
//                    System.out.println("num   "+num);
//                    System.out.println("i     "+i);
//                    System.out.println("suma  "+suma);
                    System.out.println(num + " es un cuadrado perfecto.");
                    return;
                }
                i = i + 2;
            }
            System.out.println(num + " no es un cuadrado perfecto.");
        }
}
