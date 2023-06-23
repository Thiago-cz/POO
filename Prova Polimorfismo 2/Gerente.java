public class Gerente extends Funcionario {
    private double valBonusFixo;

    public Gerente(String nome, String matr, double salarioFixo, double valBonusFixo) {
        super(nome, matr, salarioFixo, 1.2);
        this.valBonusFixo = valBonusFixo;
    }

    @Override
    public double receberBonus() {
        return (getValBonus() * getSalarioFixo()) + valBonusFixo;
    }

}
