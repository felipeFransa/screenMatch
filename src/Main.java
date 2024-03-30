import br.com.alura.screenmstch.model.Movie;

public class Main {
    public static void main(String[] args) {

        Movie myMovie = new Movie();

        myMovie.setNameMovie("Harry Potter");
        myMovie.setAgeMovie(2014);
        myMovie.setMovieDuration(180);
        myMovie.setPackageIncluded(true);

        myMovie.showTechnicalSheet();
        myMovie.toAssess(8);
        myMovie.toAssess(5);
        myMovie.toAssess(3);

        System.out.println(myMovie.getAgeMovie());
        System.out.println(myMovie.getNameMovie());
        System.out.println(myMovie.getMovieDuration() + "\n");
        System.out.println(myMovie.getTotalAssessment());
        System.out.println(myMovie.getMedia());
    }
}
