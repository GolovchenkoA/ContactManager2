package artem.golovchenko.model.entity;

/**
 * Created by головченко on 07.02.2016.
 */
import javax.persistence.*;

@Entity
public class Author {
    private Long id;
    private String firstName;
    private String lastName;

    public Author() {
    }

    public Author(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
