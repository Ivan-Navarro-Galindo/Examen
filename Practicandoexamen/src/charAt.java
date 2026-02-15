import java.util.Scanner;

public class charAt {

    public static void mostrarMenu() {
        System.out.println("\n--- ANALIZADOR DE TEXTO ---");
        System.out.println("1. Ver primera y última letra");
        System.out.println("2. Deletrear palabra");
        System.out.println("3. Contar apariciones de un carácter");
        System.out.println("4. Salir");
        System.out.print("Elige una opción: ");
    }

    // Método que usa .charAt() para obtener extremos
    public static void mostrarExtremos(String texto) {
        char primera = texto.charAt(0);
        char ultima = texto.charAt(texto.length() - 1);
        System.out.println("La primera letra es: " + primera);
        System.out.println("La última letra es: " + ultima);
    }

    // Método que recorre el string letra a letra
    public static void deletrear(String texto) {
        System.out.print("Deletreando: ");
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i) + (i == texto.length() - 1 ? "" : " - "));
        }
        System.out.println();
    }

    // Método que busca un carácter específico usando .charAt()
    public static int contarCaracter(String palabra, char letra) {
        int contador = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String palabra;

        do {
            mostrarMenu();
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer tras leer un entero

            if (opcion >= 1 && opcion <= 3) {
                System.out.print("Introduce una palabra o frase: ");
                palabra = sc.nextLine();

                switch (opcion) {
                    case 1:
                        mostrarExtremos(palabra);
                        break;
                    case 2:
                        deletrear(palabra);
                        break;
                    case 3:
                        System.out.print("¿Qué letra quieres buscar?: ");
                        char letra = sc.next().charAt(0); // Lee el primer carácter de la entrada
                        int total = contarCaracter(palabra, letra);
                        System.out.println("La letra '" + letra + "' aparece " + total + " veces.");
                        break;
                }
            }
        } while (opcion != 4);

        System.out.println("¡Adiós!");
        sc.close();
    }
}