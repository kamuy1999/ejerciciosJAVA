import java.util.Scanner;
public class comprobarNumeroMayorAOtro {
    public static void main (String[] agrs){
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        // Comprobar si el número está entre 10 y 20
        if (numero > 10 && numero < 20) {
            System.out.println("El número es mayor que 10 y menor que 20.");
        } else {
            System.out.println("El número no cumple con la condición.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
