import java.util.Scanner;

public class LeeNumeros2 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      
      System.out.println( "Introduce tu nombre y edad: ");
      String nombre = s.next();
      int    edad = s.nextInt();
      double peso = s.nextDouble();
      double talla = s.nextDouble();
      
      System.out.println("tu pesoes: "+peso+" y tu talla es : "+talla);
      System.out.println("tu nombre es "+nombre+" y tu edad es"+edad);

  
 
 
    }


    
    
}
