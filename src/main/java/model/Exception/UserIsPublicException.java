package model.Exception;

public class UserIsPublicException extends Exception{
    public UserIsPublicException() {
        super();
    }

    public UserIsPublicException(String message) {
        super(message);
    }
}
