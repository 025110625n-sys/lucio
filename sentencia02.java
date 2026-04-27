public class sentencia02 {
    public static void main(String[] args) {
        System.out.println("¿cual es la capital de peru?");
        int numero = Integer.parseInt(System.console().readLine());

        if  (numero > 0) {
            System.out.println("El número ingresado es PO.");
        } else {
            System.out.println("El número ingresadoes NEGATIVO.");
        }
    }
}   
