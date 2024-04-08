import br.com.alura.screenmatch.businesslogic.RecommendationsFilter;
import br.com.alura.screenmatch.businesslogic.Timecalculator;
import br.com.alura.screenmatch.model.Episode;
import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Title;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Movie myMovie = new Movie();

        myMovie.setNameTitle("Harry Potter");
        myMovie.setAgeTitle(2014);
        myMovie.setTitleDuration(180);
        myMovie.setPackageIncluded(true);

        myMovie.toAssess(8);
        myMovie.toAssess(5);
        myMovie.toAssess(3);

        System.out.println("\nNome do titulo: " +myMovie.getNameTitle());
        System.out.println("Ano de lancamento: " +myMovie.getAgeTitle());
        System.out.println("Tempo de duracao: " +myMovie.getTitleDuration() + "\n");
//        System.out.println(myMovie.getTotalAssessment());
//        System.out.println(myMovie.getMedia());

        Serie supernatural  = new Serie();

        supernatural.setNameTitle("Supernatural");
        supernatural.setAgeTitle(2003);
        supernatural.setTemples(15);
        supernatural.setEpisodes(23);
        supernatural.setMinutesEpisode(50);

        System.out.println("Nome do titulo: " +supernatural.getNameTitle());
        System.out.println("Ano do lancamento: " +supernatural.getAgeTitle());
        System.out.println("Total de temporadas: " +supernatural.getTemples());
        System.out.println("Tempo de duracao: " +supernatural.getTitleDuration());

        Movie newMovie = new Movie();

        newMovie.setNameTitle("Senhor dos Aneis");
        newMovie.setAgeTitle(2002);
        newMovie.setTitleDuration(160);
        newMovie.setPackageIncluded(false);

        Timecalculator calculator = new Timecalculator();
        calculator.incluide(myMovie);
        calculator.incluide(newMovie);
        calculator.incluide(supernatural);
        System.out.println("\nOs titulos tem: " +calculator.getTimeTotal() + " Minutos");

        RecommendationsFilter filter  = new RecommendationsFilter();
        filter.filter(myMovie);

        Episode episodios = new Episode();
        episodios.setEpNumber(1);
        episodios.setSerie(supernatural);
        episodios.setTotalViews(300);
        filter.filter(episodios);

        ArrayList<Movie> moviesList = new ArrayList<>();

        moviesList.add(newMovie);
        moviesList.add(myMovie);
        System.out.println("Tamanho da lista " + moviesList.size());
        System.out.println("Primeiro filme " + moviesList.get(0).getNameTitle());
        System.out.println(moviesList);
    }
}