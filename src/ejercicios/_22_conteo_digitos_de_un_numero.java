package ejercicios;

public class _22_conteo_digitos_de_un_numero {
    /*
Conteo de dígitos de un número
•	Descripción: Cuenta cuántos dígitos tiene el número a = 987654. El resultado sería 6 dígitos.
•	Variables: a = 987654.
*/
        public static void main(String[] args) {
            int numero = 987654;
            int num = numero; //solo impresion
            int contador = 0;

            while (numero > 0) {
//                System.out.println("numero= "+numero); //recorriendo
//                System.out.println("contador= "+contador);// contador
                numero = numero / 10; //reduciendo el numero
                contador = contador + 1; //contador
            }

            System.out.println("El número " + num + " tiene " + contador + " dígitos.");
        }
}
