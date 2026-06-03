public class Leccion4a6 {

    public class BucleFor {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Iteración número: " + i);
            }
        }
    }

/*
Salida:
Iteración número: 1
Iteración número: 2
Iteración número: 3
Iteración número: 4
Iteración número: 5
*/

    // :small_blue_diamond: Ejemplo 2: Bucle while
    public class BucleWhile {
        public static void main(String[] args) {
            int contador = 1;

            while (contador <= 5) {
                System.out.println("Contador: " + contador);
                contador++;
            }
        }
    }

    // :small_blue_diamond: Ejemplo 3: Bucle do-while
    public class BucleDoWhile {
        public static void main(String[] args) {
            int numero = 1;

            do {
                System.out.println("Número: " + numero);
                numero++;
            } while (numero <= 3);
        }
    }
}
