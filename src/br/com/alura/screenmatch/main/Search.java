package br.com.alura.screenmatch.main;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class Search {
    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t=Avatar&apikey=3f9c31bf"))
                .build();
    }
}
