public class PessoaJ extends Pessoa{
    private String cpnj, nomeRepresentante;

    public PessoaJ(String nome, String endereco, String telefone, String cnpj,
                    String nomeRepre) {
        super(nome, endereco, telefone, -1);
        this.cpnj = cnpj;
        this.nomeRepresentante = nomeRepre;
    }
    
    public String getCpnj() {
        return cpnj;
    }

    public void setCpnj(String cpnj) {
        this.cpnj = cpnj;
    }

    public String getNomeRepresentante() {
        return nomeRepresentante;
    }

    public void setNomeRepresentante(String nomeRepresentante) {
        this.nomeRepresentante = nomeRepresentante;
    }

    @Override
    public boolean liberarEmprestimo() {
        return true;
    }

    
}
