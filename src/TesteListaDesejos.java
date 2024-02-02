package br.com.alura.comex.modelos;

public class TesteListaDesejos {
    public static void main(String[] args) {

        Produto produto6 = new Produto("Sabão em pó");
        produto6.setDescricao("Embalagem de 1kg");

        Produto produto7 = new Produto("Café solúvel");
        produto7.setDescricao("Embalagem de 50 gramas");

        ListaDeDesejos listaDeDesejos = new ListaDeDesejos();

        listaDeDesejos.adicionaProduto(produto6);
        listaDeDesejos.adicionaProduto(produto7);


        listaDeDesejos.imprimeProdutos();



    }

}
