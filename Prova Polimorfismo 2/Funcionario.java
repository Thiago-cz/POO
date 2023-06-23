public abstract class Funcionario {
    private String nome, matricula;
    private double salarioFixo, valBonus, fgts, inss;
    
    public Funcionario(String nome, String matr, double salarioFixo, double valorBonus) {
        this.nome = nome;
        this.matricula = matr;
        this.salarioFixo = salarioFixo;
        this.valBonus = valorBonus;
        this.inss = 0.11;
        this.fgts = 0.08;
    }

    public double getSalarioFInal() {
        return receberBonus() - descontoSalarial();
    }

    public double getValBonus() {
        return valBonus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public abstract double receberBonus();
    
    public double descontoSalarial(){
        return (getSalarioFixo() * fgts) + (getSalarioFixo() * inss);
    }

}