import java.util.ArrayList;

class Locadora {
    private String nome, endereco, telefone;
    private ArrayList<Pessoa> clientes;
    private ArrayList<Carro> veiculos;
    private ArrayList<Locacao> listaEmpresFinal;
    private ArrayList<Locacao> listEmpresAtual;

    public Locadora(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.clientes = new ArrayList<Pessoa>();
        this.veiculos = new ArrayList<Carro>();
        this.listaEmpresFinal = new ArrayList<Locacao>();
        this.listEmpresAtual = new ArrayList<Locacao>();
    }

    public void alugarCarro(String nomeCliente, String modeloCarro) throws ClienteException, CarroException {
        Pessoa cliente = getCliente(nomeCliente);
        Carro carro = getCarro(modeloCarro);

        if (cliente.liberarEmprestimo()) {
            if (carro.isDisponibilidade()) {
                Locacao novaLocacao = new Locacao(cliente, carro);
                this.listEmpresAtual.add(novaLocacao);
                listEmpresAtual.add(novaLocacao);
                System.out.println("Emprestimo realizado com sucesso");
            }else {
                throw new CarroException("Carro indisponivel");
            }
        } else {
            throw new ClienteException("Cliente nao pode realizar emprestimos");
        }
    }

    public void finalizarEmprest(String nomeCliente, String modeloCarro) throws LocacaoException, ClienteException, CarroException {
            Locacao locacao = getLocacao(nomeCliente, modeloCarro);
            locacao.devolucao();
            listEmpresAtual.remove(locacao);
            listaEmpresFinal.add(locacao);
            System.out.println("Devolucao relizada com sucesso");
            System.out.println("Valor da final da locacao: " + locacao.getValorFinal());
    }

    public void renovar(String cliente, String carro) throws LocacaoException, ClienteException, CarroException {
            Locacao locacao = getLocacao(cliente, carro);
            locacao.renovar();
            System.out.println("Renovacao foi um sucesso");
        }

    private Locacao getLocacao(String nomeCliente, String modeloCarro)
            throws LocacaoException, ClienteException, CarroException {
        Pessoa cliente = getCliente(nomeCliente);
        Carro carro = getCarro(modeloCarro);
        for (Locacao locacao : this.listEmpresAtual) {
            if (cliente.equals(locacao.getCliente()) && carro.equals(locacao.getCarro())) {
                return locacao;
            }
        }
        throw new LocacaoException("Locacao nao existe");
    }

    public Carro getCarro(String modelo) throws CarroException {
        for (Carro carro : this.veiculos) {
            if (modelo.equals(carro.getModelo())) {
                return carro;
            }
        }
        throw new CarroException("Carro nao existe");
    }

    public Pessoa getCliente(String nome) throws ClienteException {
        for (Pessoa c : this.clientes) {
            if (nome.equals(c.getNome())) {
                return c;
            }
        }

        throw new ClienteException("Cliente nao existe");
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

    public ArrayList<Pessoa> getClientes() {
        return clientes;
    }

    public ArrayList<Carro> getVeiculos() {
        return veiculos;
    }

    public ArrayList<Locacao> getEmprFinalz() {
        return listaEmpresFinal;
    }

    public ArrayList<Locacao> getlistEmpresAtual() {
        return listEmpresAtual;
    }
}