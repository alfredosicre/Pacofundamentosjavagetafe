
import java.util.Scanner;

public class Class16Narcisista {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número narcisista");
        String textoNumero = teclado.nextLine();
        int longitud = textoNumero.length();
        int suma = 0;
        for (int i = 0; i < textoNumero.length(); i++){
            char letra = textoNumero.charAt(i);
            String aux = String.valueOf(letra);
            int numero = Integer.parseInt(aux);
            int operacion = (int) Math.pow(numero, longitud);
            suma += operacion;
        }
        if (suma == Integer.parseInt(textoNumero)){
            System.out.println("El número " + textoNumero + " es narcisista");
        }else{
            System.out.println("El número NO es narcisista");
        }
    }
}
