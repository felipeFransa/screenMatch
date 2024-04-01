import br.com.alura.screenmatch.businesslogic.timecalculator;
import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Title;

public class Main {
    public static void main(String[] args) {

        Title myMovie = new Title();

        myMovie.setNameTitle("Harry Potter");
        myMovie.setAgeTitle(2014);
        myMovie.setTitleDuration(180);
        myMovie.setPackageIncluded(true);

        myMovie.toAssess(8);
        myMovie.toAssess(5);
        myMovie.toAssess(3);

        System.out.println(myMovie.getNameTitle());
        System.out.println(myMovie.getAgeTitle());
        System.out.println(myMovie.getTitleDuration() + "\n");
        System.out.println(myMovie.getTotalAssessment());
        System.out.println(myMovie.getMedia());

        Serie supernatural  = new Serie();

        supernatural.setNameTitle("Supernatural");
        supernatural.setAgeTitle(2003);
        supernatural.setTemples(15);
        supernatural.setEpisodes(23);
        supernatural.setMinutesEpisode(50);


        System.out.println(supernatural.getNameTitle());
        System.out.println(supernatural.getAgeTitle());
        System.out.println(supernatural.getTitleDuration());

        Movie newMovie = new Movie();

        newMovie.setNameTitle("Senhor dos Aneis");
        newMovie.setAgeTitle(2002);
        newMovie.setTitleDuration(160);
        newMovie.setPackageIncluded(false);

        timecalculator  calculator = new timecalculator();
        calculator.incluide(myMovie);
        calculator.incluide(newMovie);
        System.out.println("Os filmes tem: " +calculator.getTimeTotal() + " Minutos");
    }
}
