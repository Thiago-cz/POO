public class Engenheiro extends Funcionario{
    private int qtdProjetos;
    private double bonusPorProjeto = 1000;

    public Engenheiro(String nome, String matr, double salarioFixo, int qtdProjetos) {
        super(nome, matr, salarioFixo, 1.1);
        this.qtdProjetos = qtdProjetos;
        
    }
    @Override
    public double receberBonus(){
        return (getSalarioFixo() * getValBonus()) + (qtdProjetos * bonusPorProjeto);
    }


}
