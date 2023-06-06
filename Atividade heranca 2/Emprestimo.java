import java.time.LocalDate;
import java.time.Period;


public class Emprestimo {
    private Cliente cliente;
    private Publicacao publicacao;
    private LocalDate dataInicio, dataTermino;
    private int qtdRenovacao = 0;
    private int renovacoesPermitidas = 3;
    private double valorFinal = 0;
    //Falta lancar exceptions para o codigo ficar melhor
    public Emprestimo(Cliente usuario, Publicacao publicacao) {
        this.cliente = usuario;
        this.publicacao = publicacao;
        this.dataInicio = LocalDate.now();
        this.dataTermino = this.dataInicio.plusDays(7);
        this.publicacao.setDisponibilidade(false);
        this.cliente.setQtdEmprestimo(usuario.getQtdEmprestimo() + 1);
    }
    
    public void finalizarEmprest() {
        LocalDate dataEntrega = LocalDate.now();
        cliente.setQtdEmprestimo(cliente.getLimiteEmprestimoSimultaneo() - 1);
        publicacao.setDisponibilidade(true);
        this.valorFinal += calcularMulta(dataEntrega);
    
        if(valorFinal != 0){
            System.out.println("Valor da multa.: " + valorFinal);
        }else {
            System.out.println("Devolucao sem multas!");
        }
            
    }
    
    public boolean renovarEmprestimo(){
        if(this.qtdRenovacao <= this.renovacoesPermitidas){
            this.qtdRenovacao++;
            this.dataTermino.plusDays(7);
            return true;
        }
        return false;
    }
    
    public double calcularMulta(LocalDate dataEntrega) {
        Period diferenca = Period.between(dataEntrega, dataTermino);
        return diferenca.getDays() * this.publicacao.getValorMulta();
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Publicacao getPublicacao() {
        return publicacao;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public int getQtdRenovacao() {
        return qtdRenovacao;
    }

    public int getRenovacoesPermitidas() {
        return renovacoesPermitidas;
    }

    public double getValorFinal() {
        return valorFinal;
    }

}
