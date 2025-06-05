
import java.util.Scanner;

public class Class10TablaMultiplicar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);
        for (int i = 1; i <= 10; i++){
            int operacion = numero * i;
            //5 * 1 = 5
            System.out.println(numero + " * " + i + " = " + operacion);
        }
    }
}
