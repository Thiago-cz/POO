public class Locacao {
    private int qtdRenovacao = 0;
    private Pessoa cliente;
    private Carro carro;
    private double valorFinal;

    public Locacao(Pessoa cliente, Carro carro){
        this.cliente = cliente;
        this.carro = carro;
        this.carro.setDisponibilidade(false);
        this.cliente.setQtdEmprestimos(cliente.getQtdEmprestimos() + 1);
    }

    public void devolucao(){
        this.carro.setDisponibilidade(true);
        cliente.setQtdEmprestimos(cliente.getQtdEmprestimos() - 1);
        calcularValorFinal();
        System.out.println("Devolucao realizada com sucesso");
    }

    public void renovar(){
        this.qtdRenovacao++;
    }

    private void calcularValorFinal(){
       valorFinal = carro.calcularValorMulta(qtdRenovacao) + carro.getValorLocacao();
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public Carro getCarro() {
        return carro;
    }

    public double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(double valorFinal) {
        this.valorFinal = valorFinal;
    }
    
}
