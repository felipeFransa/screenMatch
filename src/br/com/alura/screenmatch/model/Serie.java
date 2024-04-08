package br.com.alura.screenmatch.model;

public class Serie extends Title {
    private int episodes;
    private int temples;
    private boolean active;
    private int minutesEpisode;

    public Serie(String nameTitle) {
        this.setNameTitle(nameTitle);
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getTemples() {
        return temples;
    }

    public void setTemples(int temples) {
        this.temples = temples;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getMinutesEpisode() {
        return minutesEpisode;
    }

    public void setMinutesEpisode(int minutesEpisode) {
        this.minutesEpisode = minutesEpisode;
    }

    @Override
    public int getTitleDuration() {
        return temples * episodes * minutesEpisode;
    }
}