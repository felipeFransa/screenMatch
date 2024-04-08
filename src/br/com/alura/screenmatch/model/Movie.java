package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.businesslogic.Classification;

public class Movie extends Title implements Classification {
    private String director;

    public Movie(String nameTitle, int ageTitle) {
        super(nameTitle, ageTitle);
    }

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return  (int) getMedia() /2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNameTitle();
    }
}