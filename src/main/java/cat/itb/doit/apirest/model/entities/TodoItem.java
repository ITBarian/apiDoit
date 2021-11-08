package cat.itb.doit.apirest.model.entities;

import lombok.Data;
import javax.persistence.*;

@Data @Entity
public class TodoItem {
    @Id @GeneratedValue
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private TodoList list;
    private String description;
    private boolean stat;
    private int priority;
}
