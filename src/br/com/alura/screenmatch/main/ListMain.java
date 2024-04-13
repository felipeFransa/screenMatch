package br.com.alura.screenmatch.main;

import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Title;

import java.util.*;

public class ListMain {
    public static void main(String[] args) {

        Movie myMovie = new Movie("Harry Potter", 2014);
        myMovie.toAssess(8);

        Serie supernatural  = new Serie("Supernatural", 2003);

        Movie newMovie = new Movie("Senhor dos Aneis", 2002);
        newMovie.toAssess(4);

        var movieDC = new Movie("Batman", 2008);
        movieDC.toAssess(6);

        var movieDisney = new Movie("Avatar", 2022);
        movieDisney.toAssess(10);

        ArrayList<Title> listWatched = new ArrayList<>();

        listWatched.add(newMovie);
        listWatched.add(myMovie);
        listWatched.add(movieDC);
        listWatched.add(supernatural);
        listWatched.add(movieDisney);

        for ( Title item: listWatched){
            System.out.println(item.getNameTitle());
            if (item instanceof Movie movie && movie.getClassification() > 2) {
                System.out.println("\nClassification: " + movie.getClassification());
            }
        }
        ArrayList<String> searchByArtist = new ArrayList<>();
        searchByArtist.add("Harry");
        searchByArtist.add("Brunce Wayne");
        searchByArtist.add("Dean");
        System.out.println("\nbefore: " +searchByArtist);

        Collections.sort(searchByArtist);
        System.out.println("\nafter: " +searchByArtist);

        Collections.sort(listWatched);
        System.out.println("\nList movie order: \n" +listWatched);

        listWatched.sort(Comparator.comparing(Title::getAgeTitle));

        System.out.println("\nAge: \n" + listWatched);
    }
}
