package entities;

public class Funcionario {

    public String nome;
    public double salariobruto;
    public double desconto;
    public double porcentagem;
    public double salarioliquido() {
         return salariobruto - desconto;
    }
    public double salarioatualizado(){
       return salariobruto += (salariobruto * porcentagem) / 100 - desconto;
    }

}
