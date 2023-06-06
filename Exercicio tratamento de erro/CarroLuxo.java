public class CarroLuxo extends Carro {

    private int qtdAirBag, tamnhPortMala;
    private boolean isGps;

    public CarroLuxo(String marca, String modelo, String placa, int ano, double valorLocacao,
            double valorMulta, int qtdAirBag, int tamnhPortaMala, boolean gps) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta, 5);
        this.qtdAirBag = qtdAirBag;
        this.tamnhPortMala = tamnhPortaMala;
        this.isGps = gps;
    }

    public int getQtdAirBag() {
        return qtdAirBag;
    }

    public void setQtdAirBag(int qtdAirBag) {
        this.qtdAirBag = qtdAirBag;
    }

    public int getTamnhPortMala() {
        return tamnhPortMala;
    }

    public void setTamnhPortMala(int tamnhPortMala) {
        this.tamnhPortMala = tamnhPortMala;
    }

    public boolean isGps() {
        return isGps;
    }

    public void setGps(boolean gps) {
        this.isGps = gps;
    }

}
