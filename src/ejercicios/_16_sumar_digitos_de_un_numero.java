package ejercicios;

public class _16_sumar_digitos_de_un_numero {
/*
* Sumar dígitos de un número
•	Descripción: Dado el número a = 5678, suma todos sus dígitos. El resultado sería 5 + 6 + 7 + 8 = 26.
•	Variables: a = 5678.
* */
    public static void main(String[] args) {
        int numero = 5678;  //numero a trabajar
        int suma = 0;       //resultado de suma
        int base=numero;    //imprimir variable

        while (numero > 0) {
            suma = suma + numero % 10;
            numero = numero / 10;
        }
        System.out.println("La suma de los dígitos de " + base + " es: " + suma);
    }


}
