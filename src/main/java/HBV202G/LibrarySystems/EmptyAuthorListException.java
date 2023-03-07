package HBV202G.LibrarySystems;

public class EmptyAuthorListException extends java.lang.Exception {
    private String message;

    public EmptyAuthorListException(String message) {
        this.message = message;
    }
}
