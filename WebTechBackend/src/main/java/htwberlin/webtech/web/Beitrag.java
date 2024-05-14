package htwberlin.webtech.web;

import java.util.Date;

public class Beitrag {
    String Titel;
    Date Release;
    String Genre;


    public Beitrag(String titel, Date release, String genre) {
        this.Titel = titel;
        this.Release = release;
        this.Genre = genre;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public Date getRelease() {
        return Release;
    }

    public void setRelease(Date release) {
        Release = release;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }
}
