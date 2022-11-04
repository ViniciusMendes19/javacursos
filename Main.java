import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String x;
        x = entrada.next();
        System.out.println("Voce digitou: " + x);

        entrada.close();
    }
}