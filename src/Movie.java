public class Movie {
    String nameMovie;
    int ageMovie;
    boolean packageIncluded;
    private int assessment;
    private int totalAssessment;
    int movieDuration;

    int getTotalAssessment(){
        return totalAssessment;
    }

    void showTechnicalSheet (){
        System.out.println(nameMovie);
        System.out.println(ageMovie);
    }

    void toAssess(double noteOne){
        assessment += noteOne;
        totalAssessment++;
    }

    double getMedia(){
        return assessment / totalAssessment;
    }
}
