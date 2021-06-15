package model.Exception;

public class NotValidePriceException extends Exception{
    public NotValidePriceException() {
        super();
    }

    public NotValidePriceException(String message) {
        super(message);
    }
}
