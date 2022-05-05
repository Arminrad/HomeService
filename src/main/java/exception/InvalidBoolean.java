package exception;

public class InvalidBoolean extends RuntimeException{
    public InvalidBoolean() {
    }

    public InvalidBoolean(String message) {
        super(message);
    }
}
