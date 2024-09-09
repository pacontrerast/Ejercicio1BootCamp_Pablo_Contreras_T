package ejercicios;

public class _25_Generar_tabla_de_multiplicar {
    /*
    * . Generar tabla de multiplicar
•	Descripción: Genera la tabla de multiplicar del número a = 7.
•	Variables: a = 7.
    * */
            public static void main(String[] args) {
            int numero = 7;     // n° multiplicar
            int limite = 10;    // limite x multiplicar
            int resultado;

            System.out.println("Tabla del " + numero);
            for (int i = 1; i <= limite; i++) {
                resultado=numero * i;
                System.out.println(numero + " x " + i + " = " + resultado);
            }
        }
}
