public class LocacaoException extends Exception{

    public LocacaoException(String mensagem){
        super(mensagem);
    }

    public LocacaoException(){
        super("Locacao nao existe");
    }

}
