import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        //System.out.println(CalculadoraBasica());
        //System.out.println(Frase());
        System.out.println(PromedioNotas());
    }

    public static String CalculadoraBasica(){
        Scanner input = new Scanner(System.in);
        System.out.println("Dime el primer numero: ");
        int a = input.nextInt();
        System.out.println("Dime el segundo numero: ");
        int b = input.nextInt();
        int mult = a*b;
        int res = a - b;
        int sum = a + b;
        int div = a / b;

        return "La suma es = " + sum + ", la resta es = " + res + ", la multiplicación es = " + mult + " y la division es = " + div;
    }

    public static String Frase(){
        Scanner input = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        String nombre = input.nextLine();
        System.out.println("Dime tu edad: ");
        int edad = input.nextInt();

        int resultado = edad + 5;

        return "Hola " + nombre + " dentro de 5 años tendras "+resultado;
    }


    public static String PromedioNotas(){
        Scanner input = new Scanner(System.in);
        System.out.println("Dime tu primera nota: ");
        double primera_nota = input.nextDouble();
        System.out.println("Dime tu segunda nota: ");
        double segunda_nota = input.nextDouble();
        System.out.println("Dime tu tercera nota: ");
        double tercera_nota = input.nextDouble();
        double resultado = (primera_nota + segunda_nota + tercera_nota)/3;
        if (resultado >= 5){
            return "Has aprobado tu media es de: " + resultado;
        }else {
            return "Has suspendido tu media es de: " + resultado;
        }

    }
}
