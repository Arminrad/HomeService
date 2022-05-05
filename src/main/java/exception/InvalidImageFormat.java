package exception;

public class InvalidImageFormat extends RuntimeException{
    public InvalidImageFormat() {
    }

    public InvalidImageFormat(String message) {
        super(message);
    }
}
