package br.com.alura.screenmatch.businesslogic;
public class RecommendationsFilter {
    public void filter(Classification toRank){
        if (toRank.getClassification() >= 5){
            System.out.println("Melhores avaliados!");
        } else if (toRank.getClassification() >= 4) {
            System.out.println("Em Alta!");
        } else if (toRank.getClassification() >= 3) {
            System.out.println("Tendecias");
        } else if (toRank.getClassification() >= 2) {
            System.out.println("Veja é avalie!");
        } else {
            System.out.println("Veja depois!");
        }
    }
}
