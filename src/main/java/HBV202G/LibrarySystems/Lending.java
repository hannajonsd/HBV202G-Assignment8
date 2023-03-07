package HBV202G.LibrarySystems;

import java.time.LocalDate;
import java.util.List;

public class Lending {
    private LocalDate dueDate;

    Book book;
    User user;

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }


}
