public class Pregunta2 {
    public static void main(String[] args) {
        /*
         * Pregunta 2A: Contador del 1 al 100 con cambios
         * Múltiplos de 3 -> "drei"
         * Múltiplos de 5 y mixtos -> "funf"
         */
        
        // Empezamos el viaje del 1 al 100
        for (int i = 1; i <= 100; i++) {
            
            // Primero chequeamos el 5. 
            // Si es múltiplo de 5, imprimimos "funf" y pasamos al siguiente número.
            if (i % 5 == 0) {
                System.out.println("funf");
            } 
            
            // Si no fue de 5, probamos si es múltiplo de 3.
            else if (i % 3 == 0) {
                System.out.println("drei");
            } 
            
            // Si no es ninguno de los anteriores, mostramos el número tal cual.
            else {
                System.out.println(i);
            }
        }
    }
}
    
