import java.util.Scanner;

public class Semana2_Edad {
    public static void main(String[] args) {

      //creamos un objeto scanner para leer la entrada desde el teclado
        Scanner scanner = new Scanner(System.in);

        //solicitamos el nombre del usuario
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();   //utilizamos variable tipo string

        //solicitamos el año de nacimiento
        System.out.print("Ingrese su año de nacimiento:");
        int añodeNacimiento = scanner.nextInt();   // utilizamos variable tipo int

        //calculamos la edad aproximda usando el año 2,025
        int edad = 2025 - añodeNacimiento;

        //mostramos el resultado en la consola
        System.out.print("Hola " + nombre + ", tu edad aproximada es:" + edad + " años.");

        //cerrar el scanner para liberar recursos
        scanner.close();
    }
}
