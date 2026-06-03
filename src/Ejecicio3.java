import java.util.Scanner;

public class Ejecicio3 {
    public static void main(String[] args){
        //System.out.println(VerificadordeEdad());
        //System.out.println(NumeroPositivoNegativo());
        System.out.println(CalificadorTemperatura());
    }

    public static String VerificadordeEdad(){
        Scanner input = new Scanner(System.in);
        System.out.println("Cuantos años tienes: ");
        int edad = input.nextInt();
        if (edad >=18){
            return "Eres mayor de edad";
        }else{
            return "Eres menor de edad";
        }
    }

    public static String NumeroPositivoNegativo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Dime un numero al azar ");
        int num = input.nextInt();

        if (num > 0){
            return "Es positivo";
        } else if (num < 0) {
            return "Es negativo";
        }else{
            return "Es 0";
        }
    }


    public static String CalificadorTemperatura(){
        Scanner input = new Scanner(System.in);
        System.out.println("La temperatura que hace ");
        float temp = input.nextFloat();

        if (temp < 10){
            return "Hace frio";
        } else if (temp >=10 && temp <=25) {
            return "Clima agradable";
        }else{
            return "Hace calor";
        }
    }
}
