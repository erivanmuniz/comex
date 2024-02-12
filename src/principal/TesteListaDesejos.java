package br.com.comex.principal;

import br.com.alura.comex.modelos.ListaDeDesejos;
import br.com.alura.comex.modelos.Produto;

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

        //outra forma de criar o array para a lista de desejos
        //ArrayList<ListaDeDesejos> lista = new ArrayList<>();

        //lista.add(produto6);
        //lista.add(produto7);

        //for (ListaDeDesejos sacola: lista){
        //System.out.println(sacola);
        //}

    }

}
