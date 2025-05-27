package Q1.codigo;

public class AdministradorRede extends FuncionarioTI {
    private String certificacao;
    private String sistemaOperacionalResponsavel;

    public AdministradorRede(String nome, String matricula, String certificacao, String sistemaOperacionalResponsavel) {
        super(nome, matricula);
        this.certificacao = certificacao;
        this.sistemaOperacionalResponsavel = sistemaOperacionalResponsavel;
    }

    public void monitorarRede() {
        System.out.println("Monitorando rede em " + sistemaOperacionalResponsavel + "...");
    }

    public void realizarBackup() {
        System.out.println("Realizando backup com certificação " + certificacao + "...");
    }

    @Override
    public void exibirDados() {
        System.out.println("\n[Administrador de Rede]");
        System.out.println("Nome: " + getNome());
        System.out.println("Matrícula: " + getMatricula());
        System.out.println("Certificação: " + certificacao);
        System.out.println("Sistema Operacional: " + sistemaOperacionalResponsavel);
    }

    @Override
    public void executarOperacoes() {
        monitorarRede();
        realizarBackup();
    }
}


