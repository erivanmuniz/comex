public class TesteComparaProdutos {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.setNome("Feijão");
        produto1.setDescricao("Pacote com 2kg");
        produto1.setPrecoUnitario(29);
        produto1.setQuantidade(10);

        Produto produto2 = new Produto();
        produto2.setNome("Feijão");
        produto2.setDescricao("Pacote com 2kg");
        produto2.setPrecoUnitario(29);
        produto2.setQuantidade(10);

        if (produto1.equals(produto2)) {
            System.out.println("Os produtos são iguais");

        } else {
            System.out.println("Os produtos são diferentes");

        }
        if (produto1 == produto2){
            System.out.println("Os objetos são iguais");
        } else {
            System.out.println("Os objetos são diferentes");
        }

        

    }
}