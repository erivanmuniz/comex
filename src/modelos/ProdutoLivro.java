package br.com.alura.comex.modelos;
import br.com.alura.comex.modelos.Identificavel;
import br.com.alura.comex.modelos.Produto;

public class ProdutoLivro extends Produto implements Identificavel {

    private String isbn;
    private int totalPaginas;

    public ProdutoLivro(String nome, String descricao, String isbn, int totalPaginas) {
        super(nome);
        this.isbn = isbn;
        this.totalPaginas = totalPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    @Override
    public String Identificar() {
        return "ProdutoLivro: " + getNome() + ", ISBN: " + getIsbn();
    }
}
