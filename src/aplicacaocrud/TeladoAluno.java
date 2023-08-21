package aplicacaocrud;
public class TeladoAluno extends TelaCadastroConsultaAlunos { // a classe TeladoAluno terá a herança da TelaCadastroConsultaAlunos
                                                              // tendo uma "cópia" de todas as suas funcionalidades
    
    public TeladoAluno () {
        setTitle("Informações do Aluno");
    }

    @Override
    public void inicializarComponentes() {
        // inserir componentes aqui
    }
}
