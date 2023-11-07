package homeTask8;

public enum Time {
    BREAKFAST("Time to breakfast"),
    LUNCH("Time to lunch"),
    DINNER("Time to dinner");
    private String message;

    Time(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
