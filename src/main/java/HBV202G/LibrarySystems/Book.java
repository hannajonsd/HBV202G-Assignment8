package HBV202G.LibrarySystems;

import java.util.List;

public class Book {
    private String title;

    List<Author> authors;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) throws EmptyAuthorListException {
        this.authors = authors;
        if (authors.size() == 0) {
            throw new EmptyAuthorListException("Author list is empty");
        }
    }

    public Book(String title, List<Author> authors) throws EmptyAuthorListException {
        this.title = title;
        this.authors = authors;
        if (authors.size() == 0) {
            throw new EmptyAuthorListException("Author list is empty");
        }
    }

    //addAuthor

}
