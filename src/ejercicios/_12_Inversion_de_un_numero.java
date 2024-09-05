package ejercicios;

public class _12_Inversion_de_un_numero {
    /*
    * 12. Inversión de un número
•	Descripción: Dado el número a = 54321, invierte el orden de sus dígitos. El resultado sería 12345.
•	Variables: a = 54321.
    * */
        public static void main(String[] args) {
            int numero = 54321;
            //longitud del arreglo
            int[] digitos = new int[5];
            int indice = digitos.length - 1;

            //arreglo con los dígitos
            while (0 != numero) {
                digitos[indice] = numero % 10;
                numero = numero / 10;
                indice = indice - 1;
            }
            int invertido = 0;
            int multiplicador = 1;
            for (int digito : digitos) {
                invertido = invertido + digito * multiplicador;
                multiplicador = multiplicador * 10;
            }
            System.out.println("El número invertido es: " + invertido);
        }
}
