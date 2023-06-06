public class CarroPopular extends Carro{
    private boolean isArCondic;

    public CarroPopular(String marca, String modelo, String placa, int ano, double valorLocacao,
                        boolean arCondicionado, double valorMulta ) {
        super(marca, modelo, placa, ano, valorLocacao, valorMulta, 1);
        this.isArCondic = arCondicionado;
    }

    public boolean getIsArCondic(){
        return isArCondic;
    }

    public void isSetArCondic(boolean temAr) {
        this.isArCondic  = temAr;
    }

}
