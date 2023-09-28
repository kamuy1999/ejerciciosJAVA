import java.util.Scanner;
public class mayorDeEdadyLicenciaManejo {
    public static void main (String[] args){
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Solicitar al usuario que indique si tiene un permiso de conducir (Sí o No)
        System.out.print("¿Tienes un permiso de conducir? (Sí/No): ");
        String tienePermiso = scanner.next();

        // Comprobar si la persona es mayor de edad y tiene un permiso de conducir
        if (edad >= 18 && tienePermiso.equalsIgnoreCase("Sí")) {
            System.out.println("Eres mayor de edad y tienes un permiso de conducir.");
        } else {
            System.out.println("No cumples con los requisitos para conducir legalmente.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
