import java.util.Locale;
import java.util.Scanner;

public class atividadesenha {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        String senha ="123ABC";
        System.out.println("Digite a senha: ");
        String digitar = entrada.nextLine();

        entrada.close();

        if (digitar.equals(senha)){
            System.out.println("Acesso permitido");
        }else System.out.println("Acesso negado! Tente novamente");
    }
}
