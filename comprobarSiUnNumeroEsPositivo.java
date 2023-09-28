import java.util.Scanner;
public class comprobarSiUnNumeroEsPositivo {
    public static void main (String[] args){
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();

        // Comprobar si el número es positivo y no es igual a cero
        if (numero > 0) {
            System.out.println("El número es positivo y no es igual a cero.");
        } else {
            System.out.println("El número no cumple con la condición.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
