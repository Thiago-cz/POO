import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor("Jose das quantas", "Doutor em Filosofia");
        Autor autor2 = new Autor("Pedro Pedroso", "Doutor em Filosofia");
        Autor autor3 = new Autor("Raimundo Nonato", "Doutor em Historia");
        Autor autor4 = new Autor("Fernandinho Silva", "Doutor em Matematica");

        ArrayList<Autor> autores = new ArrayList<>();
        autores.add(autor1);
        autores.add(autor2);
        autores.add(autor3);
        autores.add(autor4);

        ArrayList<Publicacao> publicacoes = new ArrayList<>();

        Livro livro1 = new Livro(LocalDate.parse("2002-02-15"), "Livro Primordial", publicacoes, autores, 2, "Azul",
                "1234-8-4");
        Livro livro2 = new Livro(LocalDate.parse("2004-06-13"), "Livro Promessas", publicacoes, autores, 98, "Martin",
                "6534-8-4");

        Artigo artigo1 = new Artigo(LocalDate.parse("1999-12-25"), "O mudo que exergava", publicacoes, autores,
                "Era uma vez..... blablabla");
        Artigo artigo2 = new Artigo(LocalDate.parse("2001-08-18"), null, publicacoes, autores,
                "De acordo com cientistas, o mundo vai acabar em 2018");

        Tese tese1 = new Tese(LocalDate.parse("2015-10-08"), "Como calcular o infinito", publicacoes, autor4,
                "Essa pesquisa detalha como pesquisar o infinito", LocalDate.parse("2019-05-02"), 500, "IF Goiano");
        Tese tese2 = new Tese(LocalDate.parse("2007-09-30"), "Porque fazemos coisas", publicacoes, autor4,
                "Voce vai descobrir como escapar do erro", LocalDate.parse("2020-03-14"), 820, "UFG");

        UsuarioComum userComum1 = new UsuarioComum("Joao", "65489-8774", "877.899.544-78", "blablabal@gmail.com");
        UsuarioComum userComum2 = new UsuarioComum("Pedro", "65489-8774", "877.899.544-78", "blablabal@gmail.com");
        UsuarioEspecial userEspecial1 = new UsuarioEspecial("Gabriela", "65489-8774", "877.899.544-78",
                "blablabal@gmail.com");
        UsuarioEspecial userEspecial2 = new UsuarioEspecial("Fernanda", "65489-8774", "877.899.544-78",
                "blablabal@gmail.com");

        Biblioteca biblioteca = new Biblioteca("Biblioteca saber", "Rua 8, esq. rua 9 Centro");
        biblioteca.getConjuntoPubl().add(tese1);
        biblioteca.getConjuntoPubl().add(tese2);
        biblioteca.getConjuntoPubl().add(artigo1);
        biblioteca.getConjuntoPubl().add(artigo2);
        biblioteca.getConjuntoPubl().add(livro1);
        biblioteca.getConjuntoPubl().add(livro2);
        biblioteca.getClientes().add(userEspecial2);
        biblioteca.getClientes().add(userEspecial1);
        biblioteca.getClientes().add(userComum1);
        biblioteca.getClientes().add(userComum2);

        Emprestimo emprestimo1 = new Emprestimo(userComum1, tese1);
        Emprestimo emprestimo2 = new Emprestimo(userComum1, tese2);
        Emprestimo emprestimo3 = new Emprestimo(userComum2, tese2);
        Emprestimo emprestimo4 = new Emprestimo(userEspecial1, artigo1);
        Emprestimo emprestimo5 = new Emprestimo(userEspecial1, artigo2);
        Emprestimo emprestimo6 = new Emprestimo(userEspecial2, livro1);
    }
}
