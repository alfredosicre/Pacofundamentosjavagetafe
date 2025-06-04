
import java.util.Scanner;

public class Class06MayorTresNumeros {
   public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca número 1");
        String dato = teclado.nextLine();
        int num1 = Integer.parseInt(dato);
        System.out.println("Introduzca número 2");
        dato = teclado.nextLine();
        int num2 = Integer.parseInt(dato);
        System.out.println("Introduzca número 3");
        dato = teclado.nextLine();
        int num3 = Integer.parseInt(dato);
        int mayor = 0;
        //PREGUNTAMOS POR LAS CONDICIONES
        //22 , 88, 244
        if (num1 > num2 && num1 > num3){
           mayor = num1;
        }else if (num2 > num1 && num2 > num3){
            mayor = num2;
        }else {
            mayor = num3;
        }
        System.out.println("El número mayor es " + mayor);
   } 
}
