
import java.util.Scanner;

public class Class15SumarTextoNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una serie de números");
        String textoNumeros = teclado.nextLine();
        //1234
        int suma = 0;
        for (int i = 0; i < textoNumeros.length(); i++){
            //CAPTURAMOS CADA LETRA DEL TEXTO
            // int num = 
            // Integer.parseInt(String.valueOf(textoNumeros.charAt(i)));
            char letra = textoNumeros.charAt(i);
            //CONVERTIMOS EL char A int
            //'1' --> 49 char
            //"1" --> 1  String
            String aux = String.valueOf(letra);
            int numero = Integer.parseInt(aux);
            suma += numero;
        }
        System.out.println("La suma de " + textoNumeros + " es: " + suma);
    }
}
