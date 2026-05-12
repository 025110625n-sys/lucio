public class Pregunta3 {
    public static void main(String[] args) {
        /*
         * Pregunta 3A: Cálculo de entrada de cine con descuentos.
         * Precio base: 7 soles.
         * Descuento niños (< 5 años): 60%
         * Descuento adultos mayores (> 60 años): 55%
         */
       
        //"Tarifador de Cine: Introduzca la edad del cliente para aplicar los descuentos correspondientes:"
        System.out.print("Hola bienvenido al cine ¿Qué edad tiene el cliente?: ");
        
        // Leemos la edad y la convertimos a número
        int edad = Integer.parseInt(System.console().readLine());
        
        // Empezamos con el precio estándar
        double precioFinal = 7.0;

        // Evaluamos según la edad para aplicar los descuentos
        if (edad < 5) {
            // Si tiene menos de 5 descontamos el 60% (paga solo el 40%)
            precioFinal = 7.0 * 0.40;
            System.out.println("Se aplica descuento del 60% por ser menor de 5 años.");
        } 
        else if (edad > 60) {
            // Si es mayor de 60 descontamos el 55% (paga solo el 45%)
            precioFinal = 7.0 * 0.45;
            System.out.println("Se aplica descuento del 55% por ser mayor de 60 años.");
        } 
        else {
            // Para todos los demás el precio se queda igual
            System.out.println("Se aplica el precio general de adulto.");
        }

        // Mostramos el monto final de forma clara
        System.out.println("El valor de su entrada es de " + precioFinal + " soles.");
        System.out.println("¡Disfrute la función!");
    }
}