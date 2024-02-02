package br.com.alura.comex.modelos;

public class Produto {

    private String nome;
    private String descricao;
    private double precoUnitario;
    private int quantidade;


    public Produto(String nome) {
        this.setNome(nome);
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void imprime() {
        System.out.println(">> Dados do produto");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço unitário: " + precoUnitario);
        System.out.println("Quantidade: " + quantidade);

    }

    // Método para calcular o preço com desconto
    public double calcularPrecoComDesconto(int quantidade) {
        double precoFinal;
        if (quantidade == 10) {
            // Se a quantidade for igual a 10, aplicar desconto de 10%
            precoFinal = precoUnitario * quantidade * 0.9;
        } else {
            // Caso contrário, usar o preço normal
            precoFinal = precoUnitario * quantidade;
        }
        return precoFinal;
    }

    public void imprimirDadosDoProduto() {
        System.out.println(":: Nome: " + nome);
        System.out.println(":: Descrição: " + descricao);
    }

}




