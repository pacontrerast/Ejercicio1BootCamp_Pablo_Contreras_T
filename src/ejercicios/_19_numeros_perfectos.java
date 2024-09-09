package ejercicios;

public class _19_numeros_perfectos {
/*
* Números perfectos
•	Descripción: Determina si el número a = 28 es un número perfecto. Un número perfecto es aquel cuya suma de sus divisores (excluyendo el número mismo) es igual al número.
•	Variables: a = 28.
* */
        public static void main(String[] args) {
            int numero = 28;
            int sumaDivisores = 0;
//            System.out.println("Variables iniciales");
//            System.out.println(numero);
//            System.out.println(sumaDivisores);

            //recorre ciclo hasta llegar al numero ingreso en "numero"
            for (int i = 1; i < numero; i++) {
//                System.out.println("inicio del ciclo");
//                System.out.println(numero);
//                System.out.println(sumaDivisores);
//                System.out.println(i);
                if (numero % i == 0) {
                    sumaDivisores += i;
//                    System.out.println("dentro del ciclo");
//                    System.out.println(numero);
//                    System.out.println(sumaDivisores);
//                    System.out.println(i);
                }
            }
            //Validación numero perfecto
            if (sumaDivisores == numero) {
//                System.out.println("Variables iniciales");
//                System.out.println(numero);
//                System.out.println(sumaDivisores);

                System.out.println(numero + " es un número perfecto.");
            } else {
                System.out.println(numero + " no es un número perfecto.");
            }
        }

}
