public class LeeNumeros {
       public static void main(String[] args) {
              int primerNumero, segundoNumero;
              String linea;

              System.out.println("ingresa el primer numero");
              linea = System.console().readLine();
              primerNumero = Integer.parseInt(linea);

              System.out.println("ingresa el segundo numero");
              linea = System.console().readLine();
              segundoNumero = Integer.parseInt(linea);

              int total;
              double promedio;
              total = primerNumero + segundoNumero;
              promedio = (double) primerNumero + (double) segundoNumero / 2;

              System.out.println("El resultado es: " + total);
              System.out.println("El resultado es: " + promedio);

       }

}
