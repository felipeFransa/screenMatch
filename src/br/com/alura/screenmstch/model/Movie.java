package br.com.alura.screenmstch.model;

public class Movie {
    public String nameMovie;
    public int ageMovie;
    boolean packageIncluded;
    private int assessment;
    private int totalAssessment;
    public int movieDuration;

    public int getTotalAssessment(){
        return totalAssessment;
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
