public class Main {
    public static void main(String[] args) {

        Movie myMovie = new Movie();

        myMovie.nameMovie = "Cars";
        myMovie.ageMovie = 2010;
        myMovie.movieDuration = 180;

        myMovie.showTechnicalSheet();
        myMovie.toAssess(8);
        myMovie.toAssess(5);
        myMovie.toAssess(3);

        System.out.println(myMovie.totalAssessment);
        System.out.println(myMovie.assessment);
        System.out.println(myMovie.getMedia());
    }
}
