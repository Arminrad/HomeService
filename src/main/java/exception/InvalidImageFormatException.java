package exception;

public class InvalidImageFormatException extends RuntimeException{

    public InvalidImageFormatException() { super("You uploaded an invalid image format!");}

    public InvalidImageFormatException(String message) {
        super(message);
    }
}
