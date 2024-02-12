package br.com.comex.principal;

import br.com.alura.comex.modelos.Produto;

public class TesteImprime {

    public static void main(String[] args) {
        Produto produto3 = new Produto("Livro");
        //produto3.setNome("Livro");
        produto3.setDescricao("Conjunto de folhas impressas");
        produto3.setPrecoUnitario(15);
        produto3.setQuantidade(1);

        //Imprime os dados do produto através do método void imprime(), criando na classe produto
        produto3.imprime();
    }
}
