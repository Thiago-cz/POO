public abstract class Carro {
    private String marca, modelo, placa;
    private int ano, qtdRenovacaoPermitida;
    private double valorLocacao, valorMulta;
    private boolean disponibilidade = true;

    public Carro(String marca, String modelo, String placa, int ano,
            double valorLocacao, double valorMulta, int qtdRenovacaoPermitida) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.ano = ano;
        this.valorLocacao = valorLocacao;
        this.valorMulta = valorMulta;
        this.qtdRenovacaoPermitida = qtdRenovacaoPermitida;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public boolean isDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade = disponibilidade;
    }

    public double getValorMulta() {
        return this.valorMulta;
    }
    
    public void setValorMulta(double novoValor){
        this.valorMulta = novoValor;
    }

    public double calcularValorMulta(int qtdRenovacao) {
        if (qtdRenovacao < qtdRenovacaoPermitida)
            return 0;
        else
            return valorMulta * (qtdRenovacao - qtdRenovacaoPermitida);
    }
}
