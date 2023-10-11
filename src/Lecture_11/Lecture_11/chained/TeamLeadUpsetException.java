package Lecture_11.Lecture_11.chained;

public class TeamLeadUpsetException extends Exception {
    public TeamLeadUpsetException() {
    }

    public TeamLeadUpsetException(String message) {
        super(message);
    }

    public TeamLeadUpsetException(String message, Throwable cause) {
        super(message, cause);
    }

    public TeamLeadUpsetException(Throwable cause) {
        super(cause);
    }

    public TeamLeadUpsetException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
