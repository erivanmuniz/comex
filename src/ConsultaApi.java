
import br.com.alura.comex.modelos.Produto;
import com.google.gson.*;

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
            int numero = scanner.nextInt();
            String endereco = "https://fakestoreapi.com/products/" + numero;
            System.out.println("URL da API: " + endereco);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Impressão da String jsom antes da desserialização
            String json = response.body();
            System.out.println("JSON Recebido:");
            System.out.println(json);

            // Desserializando o json para um objeto Product usando Gson
            Gson gson = new Gson();
            JsonObject jsonObject = JsonParser.parseString(json).getAsJsonObject();

            // Adaptando a correspondência dos campos conforme necessário
            String title = jsonObject.getAsJsonPrimitive("title").getAsString();
            String description = jsonObject.getAsJsonPrimitive("description").getAsString();

            Product product = new Product(title, description);

            // Imprimindo os dados
            System.out.println("Resultado da consulta:");
            System.out.println("Title: " + product.title());
            System.out.println("Description: " + product.description());
        } catch (Exception e) {
            System.out.println("Erro: dados inexistentes: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

