
import java.util.Scanner;

public class Class07DiaNacimiento {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca día");
        String dato = teclado.nextLine();
        int dia = Integer.parseInt(dato);
        System.out.println("Introduzca mes");
        dato = teclado.nextLine();
        int mes = Integer.parseInt(dato);
        System.out.println("Introduzca año");
        dato = teclado.nextLine();
        int anyo = Integer.parseInt(dato);
        if (mes == 1){
            mes = 13;
            anyo -= 1;
        }else if (mes == 2){
            mes = 14;
            anyo--;
        }
        //1.	Multiplicar el Mes más 1 por 3 y dividirlo entre 5
        int op1 = ((mes + 1) * 3) / 5;
        int op2 = anyo / 4;
        int op3 = anyo / 100;
        int op4 = anyo / 400;
        //Comentar en bloque.  Seleccionamos lo que necesitemos
        // Command + K + C
        //Descomentar codigo:  Command + K + U
        // 5.	Sumar el dia, el doble del mes, el año
        // , el resultado de la operación 1, el resultado de la operación 2
        // , menos el resultado de la operación 3 más la operación 4 más 2.
        int op5 = dia + (mes * 2) + anyo + op1 + op2 - op3 + op4 + 2;
        //6.	Dividir el resultado anterior entre 7.
        int op6 = op5 / 7;
        // 7.	Restar el número del paso 5 con el número del paso 6 por 7.
        int resultado = op5 - (op6 * 7);
        String diaSemana = "";
        if (resultado == 0){
            diaSemana = "SABADO";
        }else if (resultado == 1){
            diaSemana = "DOMINGO";
        }else if (resultado == 2){
            diaSemana = "LUNES";
        }else if (resultado == 3){
            diaSemana = "MARTES";
        }else if (resultado == 4){
            diaSemana = "MIERCOLES";
        }else if (resultado == 5){
            diaSemana = "JUEVES";
        }else if (resultado == 6){
            diaSemana = "VIERNES";
        }else {
            diaSemana = "Hemos pinchado...";
        }
        System.out.println("El día de la semana es " + diaSemana);
    }
}
