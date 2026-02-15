import java.util.Scanner;

public class NotasClaseMetodos {

    //metodo para leer notas
    public static double[] leerNotas(int n, Scanner sc) { //n viaja desde el main
        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Introduce la nota del alumno " + (i+1) + ":");
            notas[i] = sc.nextDouble();
        }
        return notas;
    }

    //metodo que calcula media
    public static double calcularMedia(double[] notas) {
        double suma = 0;

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    // recibe qué?
// devuelve qué?
// necesito un for?
// necesito comparar?
// necesito sumar?


    //metodo que compara el mayor
    public static double comparaMayor(double[] notas){
        double mayor = notas[0];

        for (int i = 0; i < notas.length; i++){
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
        }
        return mayor;
    }

    //metodo que compara menor

    //metodo para contar aprobados
}
