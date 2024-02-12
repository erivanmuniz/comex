package br.com.comex.principal;

import br.com.alura.comex.modelos.Produto;

public class TesteComportamento {

    public static void main(String[] args) {

        Produto produto1 = new Produto("Feijão");
        //produto1.setNome("Feijão");
        produto1.setDescricao("Pacote com 2kg");
        produto1.setPrecoUnitario(29);
        produto1.setQuantidade(10);

        Produto produto2 = new Produto("Queijo");
        produto2.setNome("Queijo");
        produto2.setDescricao("500 gr");
        produto2.setPrecoUnitario(25);
        produto2.setQuantidade(5);

        System.out.println("*******************************************");
        System.out.println("Nome do produto: " + produto1.getNome());
        System.out.println("Descrição: " + produto1.getDescricao());
        System.out.println("Preço Unitário: " + produto1.getPrecoUnitario());
        System.out.println("Quantidade: " + produto1.getQuantidade());
        System.out.println("******************************************");
        System.out.println("Nome do produto: " + produto2.getNome());
        System.out.println("Descrição: " + produto2.getDescricao());
        System.out.println("Preço Unitário: " + produto2.getPrecoUnitario());
        System.out.println("Quantidade: " + produto2.getQuantidade());
        System.out.println("*********************************************");


    }
}
