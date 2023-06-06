public class PessoaF extends Pessoa{

    private String cpf;

    public PessoaF(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone,1);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public boolean liberarEmprestimo() {
        return super.getQtdEmprestimos() < super.getLimiteEmprestimos();
    }
 
}
