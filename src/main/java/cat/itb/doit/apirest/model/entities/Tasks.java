package cat.itb.doit.apirest.model.entities;

import lombok.Data;
import javax.persistence.*;

@Data @Entity
public class Tasks {
    @Id @GeneratedValue
    private long id;
    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "taskList")
    private Lists list;
    private String description;
    private boolean stat;
    private int priority;
}
