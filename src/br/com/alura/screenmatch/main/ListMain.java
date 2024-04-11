package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Title;

import java.util.ArrayList;
import java.util.Scanner;

public class ListMain {
    public static void main(String[] args) {
        Scanner nameTitles = new Scanner(System.in);

        System.out.println("Nome do filme:");
        String nameMovie = nameTitles.nextLine();
        Movie myMovie = new Movie(nameMovie, 2014);
        myMovie.toAssess(5);

        Serie supernatural  = new Serie("Supernatural", 2003);

        Movie newMovie = new Movie("Senhor dos Aneis", 2002);
        newMovie.toAssess(8);

        var movieDC = new Movie("Batman", 2008);
        movieDC.toAssess(10);

        ArrayList<Title> listWatched = new ArrayList<>();

        listWatched.add(newMovie);
        listWatched.add(myMovie);
        listWatched.add(movieDC);
        listWatched.add(supernatural);

        for ( Title item: listWatched){
            System.out.println(item.getNameTitle());
            if (item instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println("Classification: " + movie.getClassification());
            }
        }
    }
}
