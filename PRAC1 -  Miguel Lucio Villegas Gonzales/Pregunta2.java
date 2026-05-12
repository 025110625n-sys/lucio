public class Pregunta2 {
    public static void main(String[] args) {
       /*
         * Pregunta 2A: Escribe un programa que muestre por consola, utilizando print, 
         * los números del 1 al 100, ambos inclusive, con un salto de línea entre cada impresión. 
         * El programa debe sustituir:
         * - Los múltiplos de 3 por la palabra "drei".
         * - Los múltiplos de 5 por la palabra "funf".
         * - Los múltiplos de 3 y 5 por la palabra "funf".
         */
        
        // Empezamos el viaje del 1 al 100
        for (int i = 1; i <= 100; i++) {
            
            // Primero chequeamos el 5. 
            // Si es múltiplo de 5 imprimimos "funf" y pasamos al siguiente número.
            if (i % 5 == 0) {
                System.out.println("funf");
            } 
            
            // Si no fue de 5 probamos si es múltiplo de 3.
            else if (i % 3 == 0) {
                System.out.println("drei");
            } 
            
            // Si no es ninguno de los anteriores mostramos el número tal cual.
            else {
                System.out.println(i);
            }
        }
    }
}
    
