import java.util.Scanner;
public class multarONoMultar {
    public static void main (String[] args){
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingresa tu edad: ");
        int edad = scanner.nextInt();

        // Solicitar al usuario que indique si tiene un permiso de conducir (Sí o No)
        System.out.print("¿Tienes un permiso de conducir? (Si/No): ");
        String tienePermiso = scanner.next();

        // Verificar las condiciones y tomar decisiones
        if (edad >= 16 && tienePermiso.equalsIgnoreCase("Si")) {
            System.out.println("No se aplica multa. Se puede ir con una advertencia.");
        } else if (edad < 18 && !tienePermiso.equalsIgnoreCase("Si")) {
            System.out.println("Llamando a tus padres, eres menor de edad y no tienes permiso de conducir.");
        } else if (edad >= 18 && !tienePermiso.equalsIgnoreCase("Si")) {
            System.out.println("Se aplica una multa. Eres mayor de edad pero no tienes permiso de conducir.");
        } else {
            System.out.println("No se pudo determinar la acción a tomar.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
