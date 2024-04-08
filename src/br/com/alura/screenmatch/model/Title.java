package br.com.alura.screenmatch.model;

public class Title {
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
}
