package cat.itb.doit.apirest.model.entities;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Data @Entity
public class TodoList {
    @Id @GeneratedValue
    public long id;
    private String name;
}
