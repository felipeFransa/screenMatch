package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.businesslogic.Classification;

public class Episode implements Classification {

    private int epNumber;
    private String epName;
    private Serie serie;

    public int getTotalViews() {
        return totalViews;
    }
    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    private int totalViews;

    public int getEpNumber() {
        return epNumber;
    }

    public void setEpNumber(int epNumber) {
        this.epNumber = epNumber;
    }

    public String getEpName() {
        return epName;
    }

    public void setEpName(String epName) {
        this.epName = epName;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassification() {
        if(totalViews > 100){
            return 5;
        } else if (totalViews > 80) {
            return 4;
        } else if (totalViews > 60) {
            return 3;
        } else if (totalViews > 40) {
            return 2;
        }else {
            return 1;
        }
    }
}
