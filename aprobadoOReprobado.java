import java.util.Scanner;
public class aprobadoOReprobado {
    public static void main (String[] args){
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la nota del estudiante
        System.out.print("Ingresa la nota del estudiante: ");
        int nota = scanner.nextInt();

        // Comprobar si el estudiante ha aprobado
        if (nota >= 60 && nota <= 100) {
            System.out.println("El estudiante ha aprobado.");
        } else {
            System.out.println("El estudiante no ha aprobado.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
