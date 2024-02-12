package br.com.comex.principal;

import br.com.alura.comex.modelos.Produto;

public class TestaDesconto {
    public static void main(String[] args) {



        Produto produto5 = new Produto("Papel Higiênico");
        produto5.setNome("Papel Higienico");
        produto5.setPrecoUnitario(28.0);


        System.out.println("Nome do produto: " + produto5.getNome());
        System.out.println("Preço do produto: " + produto5.getPrecoUnitario());

        //calcula o desconto nos produtos caso a compra tenha quantidade 10
        double precoFinal = produto5.calcularPrecoComDesconto(10);
        System.out.println("Preço na compra de 10 unidades com desconto: " + precoFinal);



    }
}
