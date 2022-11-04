import java.sql.SQLOutput;
import java.util.Scanner;

public class atividadesenha2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String senha = "123ABC";
        System.out.println("Digite a senha: ");
        String digitar = entrada.nextLine();

    while (!digitar.equals(senha)){
        System.out.println("SENHA INCORRETA! TENTE NOVAMENTE");
        digitar = entrada.nextLine();
    }
        System.out.println("ACESSO LIBERADO!");

        entrada.close();
    }

}
