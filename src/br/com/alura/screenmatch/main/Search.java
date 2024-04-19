package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.exception.ConversionErrorException;
import br.com.alura.screenmatch.model.HttpReceived;
import br.com.alura.screenmatch.model.Title;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
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
        String addressHTTP = "https://www.omdbapi.com/?t="+movie.replace(" ", "+")+"&apikey=3f9c31bf";

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(addressHTTP))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            HttpReceived myTitleHTTP = gson.fromJson(json, HttpReceived.class);

            Title myTitle = new Title(myTitleHTTP);
            System.out.println(myTitle.getNameTitle());
        } catch (NumberFormatException error){
            System.out.println("Error");
            System.out.println(error.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("argument error in search");
            System.out.println(e.getMessage());
        }catch (ConversionErrorException e){
            System.out.println(e.getMsg());
        }
        finally {
            System.out.println("finish programming");
        }
    }
}
