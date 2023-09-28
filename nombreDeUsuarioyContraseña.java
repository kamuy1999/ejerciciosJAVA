import java.util.Scanner;
public class nombreDeUsuarioyContraseña {
    public static void main (String[] args){
        // Definir un nombre de usuario y una contraseña válidos
        String usuarioValido = "johanna";
        String contrasenaValida = "sopitadearroz";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese su nombre de usuario
        System.out.print("Ingresa tu nombre de usuario: ");
        String nombreUsuario = scanner.nextLine();

        // Solicitar al usuario que ingrese su contraseña
        System.out.print("Ingresa tu contraseña: ");
        String contrasena = scanner.nextLine();

        // Verificar si el nombre de usuario y la contraseña son válidos
        if (nombreUsuario.equals(usuarioValido) && contrasena.equals(contrasenaValida)) {
            System.out.println("Acceso concedido. Bienvenida " + nombreUsuario + "!");
        } else {
            System.out.println("Acceso denegado. Nombre de usuario o contraseña incorrectos.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
