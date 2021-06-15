package model.Exception;

public class UserIsNotPublicException extends Exception{
    public UserIsNotPublicException() {
        super();
    }

    public UserIsNotPublicException(String message) {
        super(message);
    }
}
