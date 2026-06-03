import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args){
       // System.out.println(MiInformacion());
        System.out.println(CalculoEdad());
    }

    public static String MiInformacion(){
         Scanner input = new Scanner(System.in);
         System.out.println("Dime tu nombre:");
         String nombre = input.nextLine();
         System.out.println("Dime tu edad: ");
         int edad = input.nextInt();
         System.out.println("Dime tu lenguaje de programación fav: ");
         String java = input.nextLine();

     return "Mi nombre es "+ nombre + " tengo " + edad + " y mi lenguaje favorito es: " +java;
    }

    public static String CalculoEdad(){
        Scanner input = new Scanner(System.in);
        System.out.println("Dime en que año estamos: ");
        int nacimiento = input.nextInt();
        System.out.println("Dime los años que tienes: ");
        int edad = input.nextInt();

        int calculo = nacimiento - edad;
        return "Naciste en el año "+calculo;

    }

}
