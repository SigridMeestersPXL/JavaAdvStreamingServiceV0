package be.pxl.ja.streamingservice.model;

public class Documentary extends be.pxl.ja.opdracht1.Movie {
    private String topic;

    Documentary (String title, be.pxl.ja.opdracht1.Rating maturityRating) {
        super(title, maturityRating);
        setGenre(Genre.DOCUMENTARY);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
