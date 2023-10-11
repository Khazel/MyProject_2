package Lecture_11.Lecture_11.chained;

public class NoLeaveGrantedException extends RuntimeException {

    public NoLeaveGrantedException() {
    }

    public NoLeaveGrantedException(String message) {
        super(message);
    }

    public NoLeaveGrantedException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoLeaveGrantedException(Throwable cause) {
        super(cause);
    }

    public NoLeaveGrantedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
