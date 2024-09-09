package ejercicios;

public class _20_Armstrong {
    /*
* Número Armstrong
•	Descripción: Determina si el número a = 153 es un número Armstrong. Un número Armstrong es igual a la suma de sus dígitos elevados a la potencia del número de dígitos. Para 153, sería
•	Variables: a = 153.
    * */
        public static void main(String[] args) {
            int numero = 153;
            int originalNumero = numero;
            int suma = 0;
            int contadorDigitos = 0;
            // Contar los dígitos
            while (numero > 0) {
                numero = numero / 10;
                contadorDigitos = contadorDigitos + 1;
            }
            numero = originalNumero; // Restaurar el número original
            // Calcular la suma de las potencias de los dígitos
            while (numero > 0) {
                int digito = numero % 10;// calculando el resto
                suma = (int) (suma + Math.pow(digito, contadorDigitos)); // se utiliza Math.pow(base, exponente)
                numero = numero / 10;
                System.out.println(numero);
                System.out.println(suma);
                System.out.println(contadorDigitos);
            }
            if (suma == originalNumero) {
                System.out.println(originalNumero + " es un número de Armstrong.");
            } else {
                System.out.println(originalNumero + " no es un número de Armstrong.");
            }
        }
}
