import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int mayor = Integer.MIN_VALUE;

        for (int i = 0; i < 5 ; i++) { //hacemos que hasta que no introduzca 5 numeros no para de pedirlos
            System.out.println("Introduce un numero");
            numero = sc.nextInt();

            if (numero > mayor) {
                mayor = numero; //El mayor se va guardando en la media
            }

        }


        System.out.println("El mayor es: " +mayor);



    }
}

//        System.out.println("Introduce el primer numero");
//        int a = sc.nextInt();
//
//        System.out.println("Introduce el segundo numero");
//        int b = sc.nextInt();
//
//        System.out.println("Introduce el tercer numero");
//        int c = sc.nextInt();
//
//        System.out.println("Introduce el cuarto numero");
//        int d = sc.nextInt();
//
//        System.out.println("Introduce el quinto numero");
//        int e = sc.nextInt();
//
//        if (a > b && a > c && a > d && a > e) {
//            System.out.println(a);
//        }
//        if (b > a && b > c && b > d && b > e) {
//            System.out.println(b);
//        }
//        if (c > a && c > b && c > d && c > e) {
//            System.out.println(c);
//        }
//        if (d > a && d > b && d > c && d > e) {
//            System.out.println(d);
//        }
//        if (e > a && e > b && e > c && e > d) {
//            System.out.println(e);
//        }
//
//
//
//        }
