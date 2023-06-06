public class UsuarioEspecial extends Cliente {

    public UsuarioEspecial(String nome, String telefone, String cpf, String email) {
        super(nome, telefone, cpf, email, -1);
    }

    @Override
    public boolean liberarEmprestimo(){
        return true;
    }


}
