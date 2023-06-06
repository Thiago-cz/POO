public abstract class Pessoa {
    private String nome, endereco, telefone;
    private int limiteEmprestimos, qtdEmprestimos;

    public Pessoa(String nome, String endereco, String telefone, int limiteEmprestimos) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.limiteEmprestimos = limiteEmprestimos;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public abstract boolean liberarEmprestimo();

    public int getQtdEmprestimos() {
        return qtdEmprestimos;
    }

    public void setQtdEmprestimos(int qtdEmprestimos) {
        this.qtdEmprestimos = qtdEmprestimos;
    }

    public int getLimiteEmprestimos() {
        return limiteEmprestimos;
    }

    



}
