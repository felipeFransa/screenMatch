package br.com.alura.screenmatch.businesslogic;
import br.com.alura.screenmatch.model.Title;

public class Timecalculator {
    private int timeTotal;
    public int getTimeTotal() {
        return timeTotal;
    }
//    public void incluide(Title movie){
//        timeTotal += movie.getTitleDuration();
//    }
//    public void incluide(Serie serie){
//        timeTotal += serie.getTitleDuration();
//    }
    public void incluide(Title title){
        timeTotal += title.getTitleDuration();
    }
}