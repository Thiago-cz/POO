import java.util.ArrayList;


public class Rh {
    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public double calcularFolha(){
        double valorFolha = 0;
        for (Funcionario func : funcionarios) {
            valorFolha += func.getSalarioFInal();
        }
        return valorFolha;
    }

    public void removerFunc(Funcionario func){
        funcionarios.remove(func);
    }

    public void addFuncionario(Funcionario func) {
        funcionarios.add(func);
    }

}
