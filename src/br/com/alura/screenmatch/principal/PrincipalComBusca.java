package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.exceptions.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String buscar = "";
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE_WITH_SPACES)
                .setPrettyPrinting()
                .create();

        while (!buscar.equalsIgnoreCase("sair")) {

            System.out.println("Digite um filme para busca: ");
            buscar = sc.nextLine();

            if (buscar.equals("sair")){
                break;
            }
            try {
                String endereco = ("https://www.omdbapi.com/?t=%s&apikey=ed389052").formatted(URLEncoder.encode(buscar));
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                TituloOmdb filme = gson.fromJson(response.body(), TituloOmdb.class);
                System.out.println(filme);

                //try {
                Titulo meuTitulo = new Titulo(filme);
                System.out.println(meuTitulo);

                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro: ");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("[ERRO] Caracter invalido");
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            }

        }
        System.out.println(titulos);
        FileWriter escrita = new FileWriter("Filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        escrita.write("helo");
        escrita.close();
    }
}
