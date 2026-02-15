import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Banco {

    //variables que todos los metodos pueden acceder
    static double saldo = 500;
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {
        boolean salir = false;

        while (!salir) {
            mostrarMenu();
            int opcion = sc.nextInt();

            switch (opcion) {
                case 1 : consultarSaldo();
                break;
                case 2: ingresarCantidad();
                break;
                case 3: retirarCantidad();
                break;
                case 4: {
                    System.out.println("Cerrando sesion...");
                    salir = true;
                    break;
                }
                default:
                    System.out.println("Opcion no valida");
            }

        }
    }

    //METODOS
    public static void mostrarMenu() {
        System.out.println("1. Consultar saldo");
        System.out.println("2. Ingresar cantidad");
        System.out.println("3. Retirar cantidad");
        System.out.println("4. Salir");
    }

    public static void consultarSaldo() {
        System.out.println("Tu saldo actual es de: " +saldo+ " € ");
    }

    public static void ingresarCantidad() {
        System.out.println("Ingresa la nueva cantidad: ");
        double nuevacantidad = sc.nextDouble();

        if (nuevacantidad == 0) { //no puedes ingresar 0 euros
            System.out.println("Error");
        }
        if (nuevacantidad > 0) {
            saldo += nuevacantidad;
        } else System.out.println("La cantidad debe ser positiva");

    }

    public static void retirarCantidad() {
        System.out.println("Retire cantidad");
        double nuevacantidad = sc.nextDouble();
        //Le decimos que la cantidad este por encima de 0 y que sea menor o igual al saldo
        if (nuevacantidad > 0 && nuevacantidad <= saldo) {
            saldo -= nuevacantidad; //se resta
            System.out.println("Retiro exitoso.");
        } else {
            System.out.println("Error: Saldo insuficiente o cantidad inválida.");
        }

    }

}

