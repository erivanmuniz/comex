public class Endereco {

    //Criação da classe Endereco sem o método construtor

    private String bairro;
    private String cidade;
    private String complemento;
    private String estado;
    private String rua;
    private int numero;

    //Criando os métodos getters e setters

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    private static Cliente getCliente() {
        Endereco enderecoCliente = new Endereco();
        enderecoCliente.setBairro("Penha");
        enderecoCliente.setCidade("São Paulo");
        enderecoCliente.setComplemento("casa 2");
        enderecoCliente.setEstado("SP");
        enderecoCliente.setRua("Rua dos Andradas");
        enderecoCliente.setNumero(250);

        Cliente cliente1 = new Cliente("Pedro Barbosa", "21547896321",
                "pedrobarbosa@gmail.com","Eletricista", "11 998885511");
        cliente1.setEndereco(enderecoCliente);
        return cliente1;


    }

}
