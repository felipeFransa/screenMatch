package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.exception.ConversionErrorException;

public class Title implements Comparable<Title> {

    private String nameTitle;
    private int ageTitle;
    private boolean packageIncluded;
    private int assessment;
    private int totalAssessment;
    private int titleDuration;

    public Title(String nameTitle, int ageTitle) {
        this.nameTitle = nameTitle;
        this.ageTitle = ageTitle;
    }

    public Title(HttpReceived myTitleHTTP) {
        this.nameTitle = myTitleHTTP.title();

        if (myTitleHTTP.year().length() > 4){
            throw new ConversionErrorException("Error:");
        }
        this.ageTitle = Integer.valueOf(myTitleHTTP.year());
        this.titleDuration = Integer.valueOf(myTitleHTTP.runtime().substring(0, 2));
    }

    public int getTotalAssessment(){
        return totalAssessment;
    }

    public String getNameTitle() {
        return nameTitle;
    }

    public int getAgeTitle() {
        return ageTitle;
    }

    public int getTitleDuration() {
        return titleDuration;
    }

    public void setNameTitle(String nameTitle) {
        this.nameTitle = nameTitle;
    }

    public void setAgeTitle(int ageTitle) {
        this.ageTitle = ageTitle;
    }

    public void setTitleDuration(int titleDuration) {
        this.titleDuration = titleDuration;
    }

    public void setPackageIncluded(boolean packageIncluded) {
        this.packageIncluded = packageIncluded;
    }

    public void showTechnicalSheet (){
        System.out.println(nameTitle);
        System.out.println(ageTitle);
    }

    public void toAssess(double noteOne){
        assessment += noteOne;
        totalAssessment++;
    }

    public double getMedia(){
        return assessment / totalAssessment;
    }

    @Override
    public int compareTo(Title anotherTitle) {
        return this.getNameTitle().compareTo(anotherTitle.getNameTitle());
    }

    @Override
    public String toString() {
        return "Title{" +
                "nameTitle='" + nameTitle + '\'' +
                ", ageTitle=" + ageTitle +
                ", titleDuration=" + titleDuration +
                '}';
    }
}
