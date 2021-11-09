package cat.itb.doit.apirest.model.entities;

import lombok.Data;
import javax.persistence.*;

@Data @Entity
public class TodoItem {
    @Id @GeneratedValue
    private long id;
    private String description;
    private boolean stat;
    private int priority;
    @ManyToOne @JoinColumn
    private TodoList list;




}
