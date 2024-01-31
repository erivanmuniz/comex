public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Feijão";
        produto.descricao = "Pacote com 2kg";
        produto.precoUnitario = 29.00;
        produto.quantidade = 10;


        System.out.println("Nome do produto: " + produto.nome);
        System.out.println("Descrição: " + produto.descricao);
        System.out.println("Preço Unitário: " + produto.precoUnitario);
        System.out.println("Quantidade: " + produto.quantidade);



    }
}