import java.util.Scanner;

public class Leccion2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));
        System.out.println("División: " + (a / b));
        System.out.println("Módulo: " + (a % b));

        Scanner input = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = input.nextLine();

        System.out.print("Ingresa tu edad: ");
        int edad = input.nextInt();

        System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
        input.close();
    }

}