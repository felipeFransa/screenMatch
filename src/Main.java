import br.com.alura.screenmatch.model.Title;

public class Main {
    public static void main(String[] args) {

        Title myMovie = new Title();

        myMovie.setNameTitle("Harry Potter");
        myMovie.setAgeTitle(2014);
        myMovie.setTitleDuration(180);
        myMovie.setPackageIncluded(true);

        myMovie.showTechnicalSheet();
        myMovie.toAssess(8);
        myMovie.toAssess(5);
        myMovie.toAssess(3);

        System.out.println(myMovie.getAgeTitle());
        System.out.println(myMovie.getNameTitle());
        System.out.println(myMovie.getTitleDuration() + "\n");
        System.out.println(myMovie.getTotalAssessment());
        System.out.println(myMovie.getMedia());
    }
}
