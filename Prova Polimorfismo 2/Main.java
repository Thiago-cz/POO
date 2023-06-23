public class Main {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Joao", "12g34r", 15000, 5000);
        Gerente g2 = new Gerente("Fernando", "12dsf2r", 12000, 2900);
        Gerente g3 = new Gerente("Cleiton", "ee34rf", 10000, 3000);
        Engenheiro e1 = new Engenheiro("Roberto", "11d2d3", 8000, 20);
        Engenheiro e2 = new Engenheiro("Ismael", "445d6dee", 8500, 35);
        Estagiario es1 = new Estagiario("Pedro", "npp123", 1800, 17);
        Estagiario es2 = new Estagiario("Bruno", "b54ff", 2000, 25);

        //Adicionar Funcionarios
        Rh rh = new Rh();
        // rh.addFuncionario(g1);
        // rh.addFuncionario(g2);
        // rh.addFuncionario(g3);
        // rh.addFuncionario(e1);
        // rh.addFuncionario(e2);
        rh.addFuncionario(es1);
        // rh.addFuncionario(es2);

        //Remover Funcionarios
        // rh.removerFunc(g3);

        //Calcular Folha de Pagamento
        System.out.println(rh.calcularFolha());


    }
}
