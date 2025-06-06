
import java.util.Scanner;

public class Class08CalcularSalario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int horas = 0;
        int kilometros = 0;
        int horasExtra = 0;
        int importeHora = 0;
        int salario = 0;
        int salarioExtra = 0;
        String destino = "";
        String retencion = "";
        float iva = 0;
        System.out.println("Introduzca horas semanales");
        String dato = teclado.nextLine();
        horas = Integer.parseInt(dato);
        System.out.println("Introduzca precio/hora");
        dato = teclado.nextLine();
        importeHora = Integer.parseInt(dato);
        System.out.println("Kilometros recorridos");
        dato = teclado.nextLine();
        kilometros = Integer.parseInt(dato);
        if (horas > 36){
            //Tenemos horas extra
            horasExtra = horas - 36;
            salario = 36 * importeHora;
            salarioExtra = horasExtra * (importeHora + 2);
            salario = salario + salarioExtra;
        }else {
            salario = horas * importeHora;
        }
        //comprobamos el destino segun km
        if (kilometros > 101 && kilometros < 900){
            destino = "NACIONAL";
        }else if (kilometros > 900){
            destino = "INTERNACIONAL";
        }else {
            destino = "PROVINCIAL";
        }
        //comprobamos el salario para la retencion
        if (salario <= 250){
            retencion = "0%";
        }else if (salario > 500){
            retencion = "50%";
        }else {
            retencion = "20%";
        }
        iva = (float)(salario * 0.16);
        System.out.println("Horas trabajadas: " + horas);
        System.out.println("Horas extras: " + horasExtra);
        System.out.println("Importe hora: " + importeHora);
        System.out.println("Kilometros: " + kilometros);
        System.out.println("Destino: " + destino);
        System.out.println("Retención: " + retencion);
        System.out.println("Salario base: " + salario);
        System.out.println("Salario extra: " + salarioExtra);
        System.out.println("Iva (16%): " + iva);
        System.out.println("-------------------------");
        System.out.println("Salario final: " + (salario - iva));
    }
}
