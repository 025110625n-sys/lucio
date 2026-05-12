public class Pregunta4 {
    public static void main(String[] args) {
        /*
         * Pregunta 4A: Escriba un programa que permita introducir 5 números enteros 
         * por teclado y muestre el menor de ellos.
         */

        System.out.println("--- Comparador de Números Enteros ---");
        System.out.println("Por favor, introduzca 5 números uno por uno:");

        // Empezamos pidiendo el primer número. 
        // Lo guardamos como el 'menor' provisionalmente.
        System.out.print("Ingrese el primer número: ");
        int menor = Integer.parseInt(System.console().readLine());

        // Pedimos el segundo y comparamos
        System.out.print("Ingrese el segundo número: ");
        int n2 = Integer.parseInt(System.console().readLine());
        if (n2 < menor) {
            menor = n2; // Si es más pequeño, actualizamos nuestra variable 'menor'
        }

        // Pedimos el tercero y comparamos
        System.out.print("Ingrese el tercer número: ");
        int n3 = Integer.parseInt(System.console().readLine());
        if (n3 < menor) {
            menor = n3;
        }

        // Pedimos el cuarto y comparamos
        System.out.print("Ingrese el cuarto número: ");
        int n4 = Integer.parseInt(System.console().readLine());
        if (n4 < menor) {
            menor = n4;
        }

        // Pedimos el quinto y comparamos
        System.out.print("Ingrese el quinto número: ");
        int n5 = Integer.parseInt(System.console().readLine());
        if (n5 < menor) {
            menor = n5;
        }

        // Usamos una línea vacía para separar la entrada de los datos del resultado
        System.out.println();
        
        //"Tras revisar todos los números, el valor más pequeño encontrado es: "
       System.out.println(); // Esto deja un renglón vacío
       System.out.println("Resultado: El número menor es " + menor);
    }
}