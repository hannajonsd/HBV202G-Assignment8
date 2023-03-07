package HBV202G.LibrarySystems;

import java.lang.Exception;

public class UserOrBookDoesNotExistException extends java.lang.Exception {

    private String message;

    public UserOrBookDoesNotExistException(String message) {
        this.message = message;
    }
}
