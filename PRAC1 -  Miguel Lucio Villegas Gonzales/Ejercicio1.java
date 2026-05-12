public class Ejercicio1 {
    public static void main(String[] args) {
    /*
     * Pregunta 1A: Escriba un programa que lea un carácter y si es o no una vocal.
     */

    System.out.print("Introduzca una letra: ");
    
    // Leemos la entrada y la convertimos a minúscula para asegurar la comparación
    String letra = System.console().readLine().toLowerCase();

    // El switch evalúa la cadena ingresada
    switch (letra) {
        case "a":
        case "e":
        case "i":
        case "o":
        case "u":
            // Si coincide con cualquier vocal, imprime que lo es
            System.out.println("Es una vocal.");
            break;
        default:
            // Si no es ninguna de las anteriores, entra por defecto aquí
            System.out.println("No es una vocal.");
            break;
    }
}
}
