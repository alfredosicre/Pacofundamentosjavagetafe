
import java.util.Scanner;

public class Class17ValidarIsbn {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número ISBN");
        String isbn = teclado.nextLine();
        if (isbn.length() == 10){
            int suma = 0;
            for (int i = 0; i < isbn.length(); i++){
                char letra = isbn.charAt(i);
                String aux = String.valueOf(letra);
                int numero = Integer.parseInt(aux);
                int operacion = numero * (i + 1);
                suma += operacion;
            }
            if (suma%11 == 0){
                System.out.println("El número ISBN es correcto!!!");
            }else{
                System.out.println("El número ISBN es incorrecto");
            }
        }else{
            System.out.println("El número ISBN debe ser de 10 caracteres");
        }
    }
}
