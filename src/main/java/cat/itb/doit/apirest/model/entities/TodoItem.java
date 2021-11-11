package cat.itb.doit.apirest.model.entities;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Data @Entity
public class TodoItem {
    @Id @GeneratedValue
    private long id;
    private String description;
    private boolean stat;
    private int priority;
    @ManyToOne
    private TodoList list;
}
