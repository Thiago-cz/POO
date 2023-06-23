public class Estagiario extends Funcionario {
    private int mesesTrabh;

    public Estagiario(String nome, String matr, double salarioFixo, int mesesTrabh) {
        super(nome, matr, salarioFixo, 0.01);
        this.mesesTrabh = mesesTrabh;
    }

    @Override
    public double receberBonus() {
        if (mesesTrabh <= 24) {
            return (getSalarioFixo() * getValBonus() * mesesTrabh) + getSalarioFixo();
        }
        int limiteMesesBonus = 24;
        return (getSalarioFixo() * getValBonus() * limiteMesesBonus) + getSalarioFixo();
    }

    @Override
    public double descontoSalarial() {
        return 0;
    }

    

}
