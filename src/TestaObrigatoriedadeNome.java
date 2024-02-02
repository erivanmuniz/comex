import br.com.alura.comex.modelos.Produto;

public class TestaObrigatoriedadeNome {

    public static void main(String[] args) {

        //Testando obrigatorieadade do usuário da aplicação para digitar o nome do objeto ao instanciá-lo
        //após criar o método construtor na classe produto:
                //método construtor
           /* public Produto(String nome) {
            this.setNome(nome);
        }*/



        Produto produto1 = new Produto("Feijão");
        produto1.setDescricao("Pacote com 2kg");
        produto1.setPrecoUnitario(29);
        produto1.setQuantidade(10);

        Produto produto4 = new Produto("Arroz");
        produto4.setDescricao("Pacote com 5kg");
        produto4.setPrecoUnitario(33);
        produto4.setQuantidade(5);

        // método que imprime os dados dos produtos
        produto1.imprime();
        produto4.imprime();
    }
}
