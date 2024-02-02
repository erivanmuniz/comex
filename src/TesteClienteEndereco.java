import java.util.SortedMap;
import java.util.concurrent.Callable;

public class TesteClienteEndereco {

    public static void main(String[] args) {
        Endereco enderecoCliente = new Endereco();
        enderecoCliente.setBairro("Penha");
        enderecoCliente.setCidade("São Paulo");
        enderecoCliente.setComplemento("casa 2");
        enderecoCliente.setEstado("SP");
        enderecoCliente.setRua("Rua dos Andradas");
        enderecoCliente.setNumero(250);

        Cliente cliente1 = new Cliente();
        cliente1.setNomeCliente("Pedro Barbosa");
        cliente1.setCpf("21547896321");
        cliente1.setEmail("pedrobarbosa@gmail.com");
        cliente1.setProfissao("Eletricista");
        cliente1.setTelefone("11 998885511");
        cliente1.setEndereco(enderecoCliente);

        System.out.println("Informações do Cliente: ");
        System.out.println("Nome: " + cliente1.getNomeCliente());
        System.out.println("CPF: " + cliente1.getCpf());
        System.out.println("E-mail: " + cliente1.getEmail());
        System.out.println("Profissão: " + cliente1.getProfissao());
        System.out.println("Telefone: " + cliente1.getTelefone());
        System.out.println("\nEndereço:");
        System.out.println("Bairro: " + cliente1.getEndereco().getBairro());
        System.out.println("Cidade: " + cliente1.getEndereco().getCidade());
        System.out.println("Complemento: " + cliente1.getEndereco().getComplemento());
        System.out.println("Estado: " + cliente1.getEndereco().getEstado());
        System.out.println("Rua: " + cliente1.getEndereco().getRua());
        System.out.println("Número: " + cliente1.getEndereco().getNumero());
    }
}
