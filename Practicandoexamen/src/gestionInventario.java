import java.util.Scanner;

public class gestionInventario {

    //atributos globales
    static String nombreProducto;
    static int stock = 10;
    static double precio = 800;
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {

        int opcion = 0;

        while (opcion != 5) {
            System.out.println("Elige una opcion: ");
            mostrarMenu();
             opcion = sc.nextInt();

             switch (opcion) {
                case 1:
                    verProducto();
                    break;
                case 2:
                    cambiarNombre();
                    break;
                case 3:
                    realizarVenta();
                    break;
                case 4:
                    aplicarDescuento();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opcion no valida");

            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("1. Ver producto");
        System.out.println("2. Cambiar nombre del producto");
        System.out.println("3. Realizar venta");
        System.out.println("4. Aplicar descuento");
        System.out.println("5. Salir");
    }

    public static void verProducto() {
        System.out.println("El nombre del producto es: " +nombreProducto);
        System.out.println("Hay "  +stock+  " "  +nombreProducto);
        System.out.println(precio+ " €");
    }

    public static void cambiarNombre() {

        System.out.println("El nombre actual es " +nombreProducto);
        System.out.println("Introduce el nuevo nombre:");

        sc.nextLine();

        nombreProducto = sc.nextLine();

        System.out.println("Nombre actualizado");
    }

    public static void realizarVenta() {
        System.out.println("Escribe la cantidad de stock que quieras vender ");

        int vender = sc.nextInt();

        if (stock > vender) {
            stock -= vender;
        } else {
            System.out.println("Error, no puedes vender una cantidad que no tienes");
        }
    }

    public static void aplicarDescuento() {
        sc.nextLine();
        System.out.println("Introduce codigo promocional: ");
        String codigo = sc.nextLine();

        if (codigo.equals("PROMO10")){
            precio -= (precio * 0.10);
        } else if (codigo.startsWith("D")) {
            precio -= (precio * 0.5);
        } else
            System.out.println("Codigo no valido");
    }
}
