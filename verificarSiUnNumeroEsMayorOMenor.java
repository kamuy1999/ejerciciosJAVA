import java.util.Scanner;
public class verificarSiUnNumeroEsMayorOMenor {
    public static void main (String[] args){
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();

        // Comprobar si el número es menor que 50 o mayor que 100
        if (numero < 50 || numero > 100) {
            System.out.println("El número es menor que 50 o mayor que 100.");
        } else {
            System.out.println("El número no cumple con la condición.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

