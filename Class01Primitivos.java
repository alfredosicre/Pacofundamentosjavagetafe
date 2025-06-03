import java.util.Scanner;

public class Class01Primitivos {
    public static void main(String[] args) {
        //QUIERO PEDIR AL USUARIO UN TEXTO
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca su nombre");
        //ALMACENAMOS EL NOMBRE DEL USUARIO
        String nombre = teclado.nextLine();
        System.out.println("Bienvenido a Java " + nombre);
        //CONVERSION AUTOMATICA
        //byte menor = 15;
        //int mayor = menor;
        
        //CONVERSION ENTRE PRIMITIVOS
        int mayor = 15;
        byte menor = (byte) mayor;

        //CONVERTIR STRING A PRIMITIVO
        String texto = "12";
        int variable = Integer.parseInt(texto);
        

        //GUARDAR UN PRIMITIVO EN STRING
        int numero = 15;
        String texto2 = String.valueOf(numero); //"15"
        System.out.println("Fin de programa");
    }
}