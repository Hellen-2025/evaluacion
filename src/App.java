import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese número");
        String numeroPar = sc. nextLine();

        int numero = Integer.parseInt (numeroPar);

        if (numero %2 == 0 ){
            System.out.println("El número es par");
        }


    }
}