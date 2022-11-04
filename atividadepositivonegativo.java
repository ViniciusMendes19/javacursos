import java.util.Scanner;

public class atividadepositivonegativo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        entrada.close();

        if (numero >= 0) {
            System.out.println("Número positivo!");
        } else System.out.println("Número negativo!");
    }
}