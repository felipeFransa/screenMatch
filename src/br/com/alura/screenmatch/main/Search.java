package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.model.Title;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner searchMovie = new Scanner(System.in);
        System.out.println("Search movie:");
        String movie = searchMovie.nextLine();

        String addressHTTP = "https://www.omdbapi.com/?t="+movie+"&apikey=3f9c31bf";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(addressHTTP))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new Gson();
        Title myTitle = gson.fromJson(json, Title.class);
        System.out.println(myTitle);


    }
}
