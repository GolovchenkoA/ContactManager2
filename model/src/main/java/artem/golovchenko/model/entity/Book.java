package artem.golovchenko.model.entity;

import java.util.List;

/**
 * Created by головченко on 07.02.2016.
 */
public class Book {
    private Long id;
    private String title;
    private List<Author> authors;

/*    public Book() {
    }

    public Book(Long id) {
        this.id = id;
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
