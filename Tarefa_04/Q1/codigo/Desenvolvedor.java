package Q1.codigo;

public class Desenvolvedor extends FuncionarioTI {
    private String linguagemPrincipal;
    private String nivel;

    public Desenvolvedor(String nome, String matricula, String linguagemPrincipal, String nivel) {
        super(nome, matricula);
        this.linguagemPrincipal = linguagemPrincipal;
        this.nivel = nivel;
    }

    public void desenvolverProjeto() {
        System.out.println("Desenvolvendo projeto em " + linguagemPrincipal + "...");
    }

    public void revisarCodigo() {
        System.out.println("Revisando código como " + nivel + "...");
    }

    @Override
    public void exibirDados() {
        System.out.println("\n[Desenvolvedor]");
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Linguagem Principal: " + linguagemPrincipal);
        System.out.println("Nível: " + nivel);
    }

    @Override
    public void executarOperacoes() {
        desenvolverProjeto();
        revisarCodigo();
    }
}
