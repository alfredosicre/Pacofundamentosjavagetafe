
import java.util.Scanner;

public class Class04PositivoNegativo {
    public static void main(String[] args) {
        //PODEMOS COMBINAR CON SCANNER
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número");
        String dato = teclado.nextLine();
        //Convertimos dato a int
        int numero = Integer.parseInt(dato);
        if (numero > 0){
            System.out.println("El número es POSITIVO");
        }else if (numero == 0) {
            System.out.println("El número es CERO");
        }else {
            System.out.println("El número es NEGATIVO");
        }
        System.out.println("Fin de programa");
    }
}
