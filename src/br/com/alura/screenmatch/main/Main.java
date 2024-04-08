package br.com.alura.screenmatch.main;
import br.com.alura.screenmatch.businesslogic.RecommendationsFilter;
import br.com.alura.screenmatch.businesslogic.Timecalculator;
import br.com.alura.screenmatch.model.Episode;
import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner moviesNotes = new Scanner(System.in);

        Movie myMovie = new Movie("Harry Potter", 2014);
        myMovie.setTitleDuration(180);
        myMovie.setPackageIncluded(true);

        System.out.println();
        int note1 = moviesNotes.nextInt();
        myMovie.toAssess(note1);
        System.out.println();
        int note2 = moviesNotes.nextInt();
        myMovie.toAssess(note2);
        System.out.println();
        int note3 = moviesNotes.nextInt();
        myMovie.toAssess(note3);

        System.out.println("Media: " +myMovie.getMedia());

        System.out.println("\nNome do titulo: " +myMovie.getNameTitle());
        System.out.println("Ano de lancamento: " +myMovie.getAgeTitle());
        System.out.println("Tempo de duracao: " +myMovie.getTitleDuration() + "\n");

        Serie supernatural  = new Serie("Supernatural", 2003);
        supernatural.setTemples(15);
        supernatural.setEpisodes(23);
        supernatural.setMinutesEpisode(50);

        System.out.println("Nome do titulo: " +supernatural.getNameTitle());
        System.out.println("Ano do lancamento: " +supernatural.getAgeTitle());
        System.out.println("Total de temporadas: " +supernatural.getTemples());
        System.out.println("Tempo de duracao: " +supernatural.getTitleDuration());

        Movie newMovie = new Movie("Senhor dos Aneis", 2002);
        newMovie.setTitleDuration(160);
        newMovie.setPackageIncluded(false);

        Timecalculator calculator = new Timecalculator();
        calculator.incluide(myMovie);
        calculator.incluide(newMovie);
        calculator.incluide(supernatural);
        System.out.println("\nOs titulos tem: " +calculator.getTimeTotal() + " Minutos");

        RecommendationsFilter filter  = new RecommendationsFilter();
        filter.filter(myMovie);

        var movieDC = new Movie("Batman", 2008);
        movieDC.setTitleDuration(180);

        Episode episodios = new Episode();
        episodios.setEpNumber(1);
        episodios.setSerie(supernatural);
        episodios.setTotalViews(300);
        filter.filter(episodios);

        ArrayList<Movie> moviesList = new ArrayList<>();

        moviesList.add(newMovie);
        moviesList.add(myMovie);
        moviesList.add(movieDC);
        System.out.println("\nExiste " + moviesList.size());
        System.out.println("\nPrimeiro filme " + moviesList.get(0).getNameTitle());
        System.out.println(moviesList);
    }
}