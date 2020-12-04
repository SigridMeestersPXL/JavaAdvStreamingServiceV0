package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Profile {
    private String name;
    private LocalDate dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean allowedToWatch(Content content) {
        int geboortejaar = dateOfBirth.getYear();
        int huidigjaar = 2020;
        if (dateOfBirth == null) {
            return false;
        }
        Rating rating = content.getMaturityRating();
        if (huidigjaar - geboortejaar >= 16) {
            return true;
        } else if (huidigjaar - geboortejaar >= 12 &&
                (rating == Rating.TEENS || rating == Rating.OLDER_KIDS || rating == Rating.LITTLE_KIDS)) {
            return true;
        } else if (huidigjaar - geboortejaar >= 7 &&
                (rating == Rating.OLDER_KIDS || rating == Rating.LITTLE_KIDS)) {
            return true;
        } else {
            return false;
        }


    }
}
