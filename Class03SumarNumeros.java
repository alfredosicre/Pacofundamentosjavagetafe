
import java.util.Scanner;

public class Class03SumarNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca número 1");
        //Almacenamos el primer numero
        //El numero debemos almacenarlo como entero
        //Voy a capturar el dato como String
        String dato = teclado.nextLine();
        //Convertimos el dato a int
        int numero1 = Integer.parseInt(dato);
        System.out.println("Introduzca número 2");
        //Volvemos a utilizar la variable dato
        dato = teclado.nextLine();
        //Convertimos el dato a int
        int numero2 = Integer.parseInt(dato);
        //Realizamos la suma
        int suma = numero1 + numero2;
        //Dibujamos la suma
        System.out.println("La suma es " + suma);
        System.out.println("Fin de programa");
    }
}
