public class Leccion3 {
    public static void main(String[] args){
        int edad = 18;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        double nota = 4.3;

        if (nota >= 4.5) {
            System.out.println("Excelente :clap:");
        } else if (nota >= 3.0) {
            System.out.println("Aprobado :white_check_mark:");
        } else {
            System.out.println("Reprobado :x:");
        }

        String usuario = "Tsuna";
        String contrasena = "1234";

        if (usuario.equals("Tsuna") && contrasena.equals("1234")) {
            System.out.println("Acceso concedido :white_check_mark:");
        } else {
            System.out.println("Acceso denegado :x:");
        }
    }
}
