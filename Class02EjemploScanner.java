
import java.util.Scanner;

public class Class02EjemploScanner {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //Pedimos un nombre y lo almacenamos
        System.out.println("Introduzca su nombre");
        String nombre = teclado.nextLine();
        //Pedimos al usuario la edad y lo almacenamos
        System.out.println("Introduzca su edad");
        String edad = teclado.nextLine();
        System.out.println("Su nombre es " + nombre
        + " y su edad es " + edad);
        System.out.println("Fin de programa");
    }
}
