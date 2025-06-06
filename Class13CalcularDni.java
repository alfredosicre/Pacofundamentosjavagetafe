
import java.util.Scanner;

public class Class13CalcularDni {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Seleccione una opción");
        System.out.println("1.- Comprobar NIF");
        System.out.println("2.- Averiguar letra NIF");
        String dato = teclado.nextLine();
        int opcion = Integer.parseInt(dato);
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET";
        if (opcion == 1){
            System.out.println("Introduzca su NIF (12345678X)");
            String dni = teclado.nextLine();
            //PARA EL CALCULO, NECESITAMOS DIVIDIR EL NUMERO DE LA LETRA
            //COMENZAMOS RECUPERANDO LA LETRA
            char letraDni = dni.charAt(dni.length() - 1);
            String temp = dni.substring(0, dni.length() - 1);
            int numeroDni = Integer.parseInt(temp);
            int resultado = (numeroDni - (numeroDni / 23) * 23);
            char letra = letrasDni.charAt(resultado);
            if (letraDni == letra){
                System.out.println("Su DNI es correcto");
            }else{
                System.out.println("Su DNI es incorrecto, su letra es " + letra);
            }
        } else {
            System.out.println("Introduzca número DNI");
            dato = teclado.nextLine();
            int numeroDni = Integer.parseInt(dato);
            int resultado = (numeroDni - (numeroDni / 23) * 23);
            char letra = letrasDni.charAt(resultado);
            System.out.println("Su letra del DNI es " + letra);
        }
    }
}
