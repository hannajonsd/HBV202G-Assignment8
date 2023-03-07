package HBV202G.LibrarySystems;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class LibrarySystems {
    List<Book> books;
    List<Lending> lendings;
    List<User> users;

    public void addBookWithTitleAndAuthorlist(String title, List<Author> authors) throws EmptyAuthorListException {
        if (authors.size() == 0) {
            throw new EmptyAuthorListException("Author list is empty");
        }
    }

    public void addStudentUser(String name, boolean feePaid) {

    }

    public void addFacultyMemberUser(String name, String department) {

    }

    public Book findBookByTitle(String title) {

    }

    public User findUserByName(String name) {

    }

    public void borrowBook(User user, Book book) throws UserOrBookDoesNotExistException {

    }

    public void extendLending(FacultyMember facultyMember, Book book, LocalDate newDueDate) throws UserOrBookDoesNotExistException {

    }

    public void returnBook(User user, Book book) throws UserOrBookDoesNotExistException {

    }
    public LibrarySystems() {
        books = new ArrayList<Book>();
        lendings = new ArrayList<Lending>();
        users = new ArrayList<User>();
    }

}
