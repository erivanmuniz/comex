package br.com.alura.comex.modelos;

import java.util.ArrayList;
import java.util.List;

public class ListaDeDesejos {
    private List<Produto> produtos;

    public ListaDeDesejos() {
        this.produtos = new ArrayList<>();
    }

    public void adicionaProduto(Produto produto) {
        produtos.add(produto);
    }

    public void imprimeProdutos() {
        System.out.println(">> Lista de desejos: \n");
        for (Produto produto : produtos) {
            produto.imprimirDadosDoProduto();
            System.out.println();
        }
    }
}
