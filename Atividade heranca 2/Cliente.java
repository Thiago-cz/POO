public abstract class Cliente {
    private String nome, telefone, cpf, email;
    private int qtdEmprestimo = 0;
    private int limiteEmprestimoSimultaneo;
    
    public Cliente(String nome, String telefone, String cpf, String email, int limiteEmprestimo) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
        this.limiteEmprestimoSimultaneo = limiteEmprestimo;
    }

    public int getQtdEmprestimo() {
        return qtdEmprestimo;
    }
    public void setQtdEmprestimo(int qtd){
        this.qtdEmprestimo = qtd;
    }

    public int getLimiteEmprestimoSimultaneo() {
        return limiteEmprestimoSimultaneo;
    }


    public abstract boolean liberarEmprestimo();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
