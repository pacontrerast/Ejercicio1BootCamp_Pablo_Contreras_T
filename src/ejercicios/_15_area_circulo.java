package ejercicios;

public class _15_area_circulo {
    /*
    * Calcular el área de un círculo
•	Descripción: Dado el radio r = 7 de un círculo, calcula su área usando la fórmula: area=pi x r(2)
•	 Variables: r = 7.
    * */
        public static void main(String[] args) {
            double radio = 7; // variable Radio
            double pi = 3.1416; // valor de pi
            double area = pi * radio * radio; //formula

            System.out.println("======================================");
            System.out.println("Calcular el Area de un círculo");
            System.out.println("El Radio ingresado es " + radio);
            System.out.println("El Area de un circulo es : " + area);
        }


}
