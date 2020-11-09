package be.pxl.ja.streamingservice.model;

public enum Rating {
    LITTLE_KIDS ("Little kids"),
    OLDER_KIDS ("Older kids", "vanaf 7 jaar"),
    TEENS ("Teens", "vanaf 12 jaar"),
    MATURE ("Mature", "vanaf 16 jaar");

    private String displayName;
    private String maturityRating;

    Rating(String displayName) {
        this.displayName = displayName;
    }

    Rating(String displayName, String maturityRating) {
        this.displayName = displayName;
        this.maturityRating = maturityRating;
    }
}
