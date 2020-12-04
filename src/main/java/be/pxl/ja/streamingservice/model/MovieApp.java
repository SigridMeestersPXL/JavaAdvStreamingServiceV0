package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class MovieApp {
    public static void main(String[] args) {

        be.pxl.ja.streamingservice.model.Movie titanic = new be.pxl.ja.streamingservice.model.Movie("Titanic", Rating.TEENS);
        be.pxl.ja.streamingservice.model.Movie legallyBlonde = new be.pxl.ja.streamingservice.model.Movie("Legally Blonde", Rating.OLDER_KIDS);

        titanic.setDirector("James Cameron");
        System.out.println("De regisseur van Titanic is " + titanic.getDirector());

        titanic.setReleaseDate(LocalDate.of(1997,1,1));

        titanic.toString();
        legallyBlonde.toString();
        }


    }

