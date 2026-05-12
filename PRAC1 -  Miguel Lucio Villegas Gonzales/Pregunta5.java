public class Pregunta5 {
    public static void main(String[] args) {
        /*
         * Pregunta 5A: Escriba un programa que pida dos números enteros al usuario, 
         * y determine si el primero es divisible entre el segundo.
         */

                System.out.println("Verificador de Divisibilidad");
        
        // Pedimos el primer número
                System.out.print("Por favor, ingrese el primer número (dividendo): ");
                int n1 = Integer.parseInt(System.console().readLine());

        // Pedimos el segundo número
                System.out.print("Ahora, ingrese el segundo número (divisor): ");
                int n2 = Integer.parseInt(System.console().readLine());

        // Primero, una validación: no se puede dividir entre cero
        if (n2 == 0) {
                System.out.println();
                System.out.println("Ups, no es posible dividir entre cero. Inténtalo de nuevo.");
            } 
        else {
        // Usamos el operador % para ver si el residuo es cero
        if (n1 % n2 == 0) {
                System.out.println();
                System.out.println("¡Sí! " + n1 + " es divisible entre " + n2 + " porque la división es exacta.");
            } else {
                System.out.println();
                System.out.println("No, " + n1 + " no es divisible entre " + n2 + " porque sobra algo en la división.");
            }
            }
        
                System.out.println(); // Renglón vacío para que no se amontone
                System.out.println("Gracias por usar el verificador. ¡Hasta pronto!");
    }
}