import java.util.Scanner;

public class Class05Estaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número (1-4)");
        String dato = teclado.nextLine();
        int numero = Integer.parseInt(dato);
        if (numero == 1){
            System.out.println("Primavera");
        }else if(numero == 2){
            System.out.println("Verano");
        }else if (numero == 3){
            System.out.println("Invierno");
        }else if(numero == 4){
            System.out.println("Otoño");
        }else {
            System.out.println("Opción incorrecta");
        }
    }
}
