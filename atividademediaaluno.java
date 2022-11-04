import java.util.Locale;
import java.util.Scanner;

public class atividademediaaluno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String aluno = entrada.nextLine();

        System.out.println("Digite a nota 1: ");
        double nota1 = entrada.nextDouble();
        System.out.println("Digite a nota 2: ");
        double nota2 = entrada.nextDouble();
        System.out.println("Digite a nota 3: ");
        double nota3 = entrada.nextDouble();
        System.out.println("Digite a nota 4: ");
        double nota4 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("Aluno: " + aluno + " -Média: " + media);
        entrada.close();
    }
}
