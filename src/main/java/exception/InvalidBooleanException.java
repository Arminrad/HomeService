package exception;

public class InvalidBooleanException extends RuntimeException{

    public InvalidBooleanException() { super("Please enter true or false!");}

    public InvalidBooleanException(String message) {
        super(message);
    }
}
