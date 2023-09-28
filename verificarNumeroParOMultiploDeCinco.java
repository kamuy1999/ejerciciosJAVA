import java.util.Scanner;
public class verificarNumeroParOMultiploDeCinco {
    public static void main (String[] args){
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        // Comprobar si el número es par o múltiplo de 5
        if (numero % 2 == 0 || numero % 5 == 0) {
            if (numero % 2 == 0) {
                System.out.println("El número es par.");
            }
            if (numero % 5 == 0) {
                System.out.println("El número es múltiplo de 5.");
            }
        } else {
            System.out.println("El número no es ni par ni múltiplo de 5.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
