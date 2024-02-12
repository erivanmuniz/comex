import br.com.alura.comex.modelos.Produto;

public class ProdutoLivro extends Produto {

    private String isbn;
    private int totalPaginas;

    public ProdutoLivro(String nome, String descricao, String isbn, int totalPaginas) {
        super(nome, descricao);
        this.isbn = isbn;
        this.totalPaginas = totalPaginas;
    }
}
