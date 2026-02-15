import java.util.Scanner;

public class Password {

    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {
        esPasswordSegura("polla1");

    }


    public static String esPasswordSegura(String password) {

        if (password.length() <= 8){
            System.out.println("Contraseña de mierda, espabila campeon :)");;
        }

        if (password.length() > 8) {
            for (int i = 0; i < password.length(); i++) {
                char c = password.charAt(i);
                if (Character.isDigit(c)) {
                    System.out.println("Eres un crack <=======3 pero bueno y este sirenoooooo?");
                }
            }
        }
        return password;
    }
}
