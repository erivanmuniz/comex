
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaApi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da API externa: ");


        try {
            int numero = scanner.nextInt();long
            String endereco = "https://fakestoreapi.com/products/" + numero;
            System.out.println(endereco);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println("Resultado da consulta:");
            System.out.println(response.body());

        } catch (Exception e) {
            //não aparecerá mensagem
            System.out.println("Erro: dados não encontrados : " + e.getMessage());
        } finally {
            scanner.close();
            
        }
    }
}

