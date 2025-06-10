
import java.util.Scanner;

public class Class18AnalizarTexto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un texto");
        String texto = teclado.nextLine();
        int numLetras = 0;
        int numDigitos = 0;
        int vocales = 0;
        int consonantes = 0;
        int mayusculas = 0;
        for (int i = 0; i < texto.length(); i++){
            char letra = texto.charAt(i);
            if (Character.isDigit(letra) == true){
                numDigitos += 1;
            }else if (Character.isLetter(letra) == true){
                numLetras += 1;
                if (Character.isUpperCase(letra) == true){
                    mayusculas += 1;
                }
                if (Character.toLowerCase(letra) == 'a'
                || Character.toLowerCase(letra) == 'e'
                || Character.toLowerCase(letra) == 'i'
                || Character.toLowerCase(letra) == 'o'
                || Character.toLowerCase(letra) == 'u'){
                    vocales += 1;
                }else{
                    consonantes += 1;  
                }
            }
        }
        System.out.println("Número de letras: " + numLetras);
        System.out.println("Número de dígitos: " + numDigitos);
        System.out.println("Mayúsculas: " + mayusculas);
        System.out.println("Vocales: " + vocales);
        System.out.println("Consonantes: " + consonantes);
    }
}
