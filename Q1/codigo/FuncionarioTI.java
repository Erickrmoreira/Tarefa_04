package Q1.codigo;

public abstract class FuncionarioTI {
    private String nome;
    private String matricula;

    public FuncionarioTI(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void atualizarCadastro(String novoNome, String novaMatricula) {
        this.nome = novoNome;
        this.matricula = novaMatricula;
    }

    public abstract void exibirDados();
    public abstract void executarOperacoes();
}
