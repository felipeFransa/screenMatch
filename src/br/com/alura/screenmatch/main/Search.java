package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exception.ConversionErrorException;
import br.com.alura.screenmatch.model.HttpReceived;
import br.com.alura.screenmatch.model.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner searchMovie = new Scanner(System.in);
        String search = "";
        List<Title> titles = new ArrayList<>();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();

        while (!search.equalsIgnoreCase("sair")) {
            System.out.println("Search movie:");
            search = searchMovie.nextLine();
            String addressHTTP = "https://www.omdbapi.com/?t="+search.replace(" ", "+")+"&apikey=3f9c31bf";
            System.out.println(addressHTTP);
            if (search.equalsIgnoreCase("sair")){
                break;
            }
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(addressHTTP)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);
                HttpReceived myTitleHTTP = gson.fromJson(json, HttpReceived.class);
                Title myTitle = new Title(myTitleHTTP);
                System.out.println(myTitle);
                titles.add(myTitle);
                System.out.println("ADD validate!!!");
            } catch (NumberFormatException error) {
                System.out.println("Error");
                System.out.println(error.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("argument error in search");
                System.out.println(e.getMessage());
            } catch (ConversionErrorException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("finish programming");
            }
        }
        System.out.println("Validate!!!");
        FileWriter record = new FileWriter("movies.json");
        record.write(gson.toJson(titles));
        record.close();
        System.out.println(titles);
    }
}
