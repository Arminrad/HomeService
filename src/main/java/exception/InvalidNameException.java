package exception;

public class InvalidNameException extends RuntimeException{

    public InvalidNameException() { super("You entered an invalid name!");}

    public InvalidNameException(String message) {
        super(message);
    }
}
