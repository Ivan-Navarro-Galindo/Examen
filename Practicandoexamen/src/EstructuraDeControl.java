import java.util.Scanner;

public class EstructuraDeControl {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Opción no valida");
        }

        for (int i = 1; i <= n ; i++) {

           if (i % 3 ==  0 && i % 5 == 0){
               System.out.println("JavaCode");
           } else if (i % 3 == 0) {
               System.out.println("Java");
           } else if (i % 5 == 0) {
               System.out.println("Code");
           }else System.out.println(i);

        }


    }
}
