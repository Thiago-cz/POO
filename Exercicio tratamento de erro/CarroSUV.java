public class CarroSUV extends Carro {
    private double tamnhPortaMala;
    private String tipoTracao, tipoCombustivel;

    public CarroSUV(String marca, String modelo, String placa, int ano, double valorLocacao,
            double tamanhPortMal, String tipoTracao, String tipoCombustivel, double valorMulta) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta, 3);
        this.tamnhPortaMala = tamanhPortMal;
        this.tipoTracao = tipoTracao;
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getTamnhPortaMala() {
        return tamnhPortaMala;
    }

    public void setTamnhPortaMala(double tamnhPortaMala) {
        this.tamnhPortaMala = tamnhPortaMala;
    }

    public String getTipoTracao() {
        return tipoTracao;
    }

    public void setTipoTracao(String tipoTracao) {
        this.tipoTracao = tipoTracao;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}
