import java.util.Scanner;

public class medias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuántos alumnos hay? ");
        int n = sc.nextInt();

        double nota;
        double suma = 0;
        double mayor = -1;
        double menor = 11;

        //contadores
        int aprobados = 0; //contador aprobados
        int suspendidos = 0; //contador suspendidos

        for(int i = 1; i <= n; i++) {
            System.out.print("Introduce la nota del alumno " + i + ": ");
            nota = sc.nextDouble();

            // sumar para la media
            suma += nota; //acumulara las notas en la variable suma

            // mayor nota
            if (nota > mayor) {
                mayor = nota;
            }
            //if (7 > 4) {4 = 7}

            // menor nota
            if(nota < menor){
                menor = nota;
            }

            // contar aprobados y suspendidos
            if(nota >= 5){
                aprobados++;
            } else {
                suspendidos++;
            }
        }

        double media = suma / n;

        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
        System.out.println("Media de clase: " + media);
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspendidos: " + suspendidos);
    }
}
