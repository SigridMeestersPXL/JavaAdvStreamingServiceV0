package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements Playable {
    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;
    public static final int LONG_PLAYING_TIME = 150;

    public Movie(String title, Rating maturityRating) {
        super(title, maturityRating);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration < 0) {
            duration = - duration;
        }
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void play() {
        System.out.println("Playing " + this);
    }

    public void pause() {
        System.out.println("Pausing " + this);
    }

    public boolean isLongPlayingTime() {
        return duration >= LONG_PLAYING_TIME;
    }

    public String getPlayingTime() {
        int uren = duration/60;
        int minuten = duration % 60;
        String string = "";
        if (uren > 0 && minuten > 0) {
            string = uren + " h " + minuten + " min";
        }
        else if (uren > 0 && minuten == 0) {
            string = uren + " h";
        }
        else if (uren == 0 && minuten > 0) {
            string = minuten + " min";
        }
        else {
            string = "?";
        }
        return string;
    }



    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        if (releaseDate != null) {
            builder.append("(").append(releaseDate.getYear()).append(")");
        }
        return builder.toString();
    }
}
