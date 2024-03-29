public class Movie {
    String nameMovie;
    int ageMovie;
    boolean packageIncluded;
    int assessment;
    int totalAssessment;
    int movieDuration;

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
