
public class UsuarioComum extends Cliente {

    public UsuarioComum(String nome, String telefone, String cpf, String email) {
        super(nome, telefone, cpf, email, 1);
    }

    @Override
    public boolean liberarEmprestimo(){
        if(getQtdEmprestimo() < getLimiteEmprestimoSimultaneo()){
            return true;
        }
        return false;
    }

}
