package be.pxl.ja.streamingservice.model;

public class Documentary extends be.pxl.ja.streamingservice.model.Movie {
    private String topic;

    public Documentary (String title, be.pxl.ja.streamingservice.model.Rating maturityRating) {
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
