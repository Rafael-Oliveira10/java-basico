package exerciciosAula24;

import java.util.Date;

public class livroDeBiblioteca01 {
    public static void main(String[] args) {

        livroDeBiblioteca livro = new livroDeBiblioteca();

        livro.titulo = "Java, como programar";
        livro.autor = "Deitel's Brothers";
        livro.editora = "Pearson";
        livro.edicao = 10;
        livro.qtdPaginas = 968;
        livro.isbn = 854300479;
        livro.emprestado = true;
        //utilizando uma intancia da classe data do java.util
        livro.dataEntrega = new Date(15/03/2024);
        livro.cliente = "Rafael";

    }
}
