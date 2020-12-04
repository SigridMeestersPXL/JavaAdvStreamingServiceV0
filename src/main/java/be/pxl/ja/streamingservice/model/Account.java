package be.pxl.ja.streamingservice.model;

public class Account {
    private String email;
    private String password;
    private StreamingPlan streamingPlan;
    private Profile profile;
    private PaymentInfo paymentInfo;

    public Account(String email, String password) {
        profile.setName("Profile1");
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public StreamingPlan getStreamingPlan() {
        return streamingPlan;
    }

    public void setStreamingPlan(StreamingPlan streamingPlan) {
        this.streamingPlan = streamingPlan;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public boolean verifyPassword(String password) {
        if (this.password == password) {
            return true;
        } else {
            return false;
        }
    }

    public Profile getFirstProfile() {
        return profile;
    }
}
