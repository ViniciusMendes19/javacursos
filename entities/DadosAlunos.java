package entities;

public class DadosAlunos {

    private String nome;
    private String email;

    public DadosAlunos(){
    }

    public DadosAlunos(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    // Para nao imprimir bugado
    public String toString() {
        return (nome + ", " + email);
    }
}
