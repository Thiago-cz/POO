
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Locadora locadoraMaikao = new Locadora("Locadora do Maikao", "Rua 7, centro", "4002-8922");
        JOptionPane.showMessageDialog(null, "Bem vindo a locadora do Maikao!");

        while (true) {
            String opcao = JOptionPane.showInputDialog("Digite a opcao desejada. " +
                    "\n1 - Cadastar novo cliente" + "\n2 - Cadastar carro" +
                    "\n3 - Novo emprestimo" + "\n4 - Finalizar emprestimo" +
                    "\n5 - Renovar emprestimo" + "\n6 - Sair");
            switch (opcao) {
                case "1":
                    int tipoCliente = Integer.parseInt(
                            JOptionPane.showInputDialog("Digite 1 para pessoa Fisica\nDigite 2 para pessoa Juridaca"));
                    if (tipoCliente == 1) {
                        PessoaF novoCliente = new PessoaF(
                                JOptionPane.showInputDialog("Digite o nome"),
                                JOptionPane.showInputDialog("Digite o endereco"),
                                JOptionPane.showInputDialog("Digite o telefone"),
                                JOptionPane.showInputDialog("Digite o cpf"));
                        locadoraMaikao.getClientes().add(novoCliente);
                        System.out.println("Cliente cadastrado com sucesso!!!");
                        continue;
                    }

                    if (tipoCliente == 2) {
                        PessoaJ novoCliente = new PessoaJ(
                                JOptionPane.showInputDialog("Digite o nome"),
                                JOptionPane.showInputDialog("Digite o endereco"),
                                JOptionPane.showInputDialog("Digite o telefone"),
                                JOptionPane.showInputDialog("Digite o cnpj"),
                                JOptionPane.showInputDialog("Digite o nome do representante"));
                        locadoraMaikao.getClientes().add(novoCliente);
                        System.out.println("Cliente cadastrado com sucesso!!");
                        continue;
                    }
                    System.out.println("Digite apenas uma das opcoes validas!!!");
                    continue;
                case "2":
                    int tipoCarro = Integer.parseInt(
                            JOptionPane.showInputDialog(
                                    "Digite 1 para Popular\nDigite 2 para SUV\nDigite 3 para Luxo"));
                    if (tipoCarro == 1) {
                        CarroPopular novoCarro = new CarroPopular(
                                JOptionPane.showInputDialog("Digite a marca "),
                                JOptionPane.showInputDialog("Digite o modelo"),
                                JOptionPane.showInputDialog("Digite o placa"),
                                Integer.parseInt(JOptionPane.showInputDialog("Digite o ano")),
                                Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da locacao")),
                                Boolean.parseBoolean("Digite True se tiver ar condicionado"),
                                Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da multa")));
                        locadoraMaikao.getVeiculos().add(novoCarro);
                        System.out.println("Carro cadastrado com sucesso");
                        continue;
                    }
                    if (tipoCarro == 2) {
                        CarroSUV novoCarro = new CarroSUV(
                                JOptionPane.showInputDialog("Digite a marca "),
                                JOptionPane.showInputDialog("Digite o modelo"),
                                JOptionPane.showInputDialog("Digite o placa"),
                                Integer.parseInt(JOptionPane.showInputDialog("Digite o ano")),
                                Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da locacao")),
                                Double.parseDouble(JOptionPane.showInputDialog("Digite o tamanho do porta malas")),
                                JOptionPane.showInputDialog("Digite o tipo de tracao"),
                                JOptionPane.showInputDialog("Digite o tipo de combustivel"),
                                Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da multa")));
                        locadoraMaikao.getVeiculos().add(novoCarro);
                        System.out.println("Carro cadastrado com sucesso");
                        continue;
                    }
                    if (tipoCarro == 3) {
                        CarroLuxo novoCarro = new CarroLuxo(
                                JOptionPane.showInputDialog("Digite o modelo"),
                                JOptionPane.showInputDialog("Digite a marca "),
                                JOptionPane.showInputDialog("Digite o placa"),
                                Integer.parseInt(JOptionPane.showInputDialog("Digite o ano")),
                                Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da locacao")),
                                Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da multa")),
                                Integer.parseInt(JOptionPane.showInputDialog("Digite qauntidade de Air Bags")),
                                Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do porta malas")),
                                Boolean.parseBoolean("Digite True se o carro possui GPS"));
                        locadoraMaikao.getVeiculos().add(novoCarro);
                        System.out.println("Carro cadastrado com suceso");
                        continue;
                    }
                    System.out.println("Digite apenas uma das opcoes validas!!!");
                    continue;
                case "3":
                    try {
                        locadoraMaikao.alugarCarro(
                                JOptionPane.showInputDialog("Digite o nome do cliente"),
                                JOptionPane.showInputDialog("Digite o modelo do carro"));
                    } catch (ClienteException e) {
                        System.out.println("Nao deu certo, " + e.getMessage());
                        e.getMessage();
                    } catch (CarroException e) {
                        System.out.println("Nao deu certo, " + e.getMessage());
                    }
                    continue;
                case "4":
                    try {
                        locadoraMaikao.finalizarEmprest(
                                JOptionPane.showInputDialog("Digite o nome do cliente"),
                                JOptionPane.showInputDialog("Digite o modelo do carro"));
                    } catch (LocacaoException e) {
                        System.out.println("Nao deu certo, " + e.getMessage());
                    } catch (ClienteException e) {
                        System.out.println("Nao deu certo, " + e.getMessage());
                    } catch (CarroException e) {
                        System.out.println("Nao deu certo, " + e.getMessage());
                    }
                    continue;
                case "5":
                    try {
                        locadoraMaikao.renovar(
                                JOptionPane.showInputDialog("Digite o nome do cliente"),
                                JOptionPane.showInputDialog("Digite o modelo do carro"));
                    } catch (LocacaoException e) {
                        System.out.println("Nao deu certo, " + e.getMessage());
                    } catch (ClienteException e) {
                        System.out.println("Nao deu certo, " + e.getMessage());
                    } catch (CarroException e) {
                        System.out.println("Nao deu certo, " + e.getMessage());
                    }
                    continue;
                case "6":
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Por favor, digite apenas uma das opcoes validas!");
                    continue;
            }
            break;
        }

    }
}
