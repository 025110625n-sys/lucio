public class Pregunta1 {
    public static void main(String[] args) {
        /*
         * Pregunta 1A: Verificador de vocales.
         * En esta versión, controlamos manualmente las mayúsculas y minúsculas.
         */
        // Mostramos un mensaje de bienvenida amigable
        System.out.print("Hola por favor introduce una sola letra: ");
        
        // Leemos la letra tal cual la escribe el usuario
        String letra = System.console().readLine();

        // Evaluamos la letra directamente en el switch
        switch (letra) {
            // Agregamos todos los casos: minúsculas y mayúsculas
            case "a":
            case "A":
            case "e":
            case "E":
            case "i":
            case "I":
            case "o":
            case "O":
            case "u":
            case "U":
                System.out.println("La letra '" + letra + "' es una vocal.");
                break;

            default:
                // Si no es ninguna de las anteriores entra aquí
                System.out.println("La letra '" + letra + "' no es una vocal.");
                break;
        }
    }
}