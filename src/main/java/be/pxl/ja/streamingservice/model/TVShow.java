package be.pxl.ja.streamingservice.model;

public final class TVShow extends be.pxl.ja.streamingservice.model.Content {
    private int numberOfSeasons;

    public TVShow(String title, be.pxl.ja.streamingservice.model.Rating maturityRating, int numberOfSeasons) {
        super(title, maturityRating);
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }
}
