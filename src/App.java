import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Creamos una instancia de la clase Scanner
        Scanner scan = new Scanner(System.in);

        // Ingreso por teclado de una cadena de caracteres
        System.out.println("Insert a word...");
        String word = scan.next();

        // Ingreso por teclado de un entero
        System.out.println("Insert a integer...");
        int number = scan.nextInt();

        // Cierre de objeto scan
        scan.close();

        // Imprimir variables
        System.out.println("myString is: " + word + "\nmyInt is: " + number);

    }
}
