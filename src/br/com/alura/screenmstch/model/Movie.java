package br.com.alura.screenmstch.model;

public class Movie {
    private String nameMovie;
    private int ageMovie;
    private boolean packageIncluded;
    private int assessment;
    private int totalAssessment;
    private int movieDuration;

    public int getTotalAssessment(){
        return totalAssessment;
    }

    public String getNameMovie() {
        return nameMovie;
    }

    public int getAgeMovie() {
        return ageMovie;
    }

    public int getMovieDuration() {
        return movieDuration;
    }

    public void setNameMovie(String nameMovie) {
        this.nameMovie = nameMovie;
    }

    public void setAgeMovie(int ageMovie) {
        this.ageMovie = ageMovie;
    }

    public void setMovieDuration(int movieDuration) {
        this.movieDuration = movieDuration;
    }

    public void setPackageIncluded(boolean packageIncluded) {
        this.packageIncluded = packageIncluded;
    }

    public void showTechnicalSheet (){
        System.out.println(nameMovie);
        System.out.println(ageMovie);
    }

    public void toAssess(double noteOne){
        assessment += noteOne;
        totalAssessment++;
    }

    public double getMedia(){
        return assessment / totalAssessment;
    }
}
