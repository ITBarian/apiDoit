package cat.itb.doit.apirest.model.entities;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.lang.Nullable;

import javax.persistence.*;

@Data @Entity @SequenceGenerator(name = "seq", initialValue = 1)
public class TodoItem {
    @Id @GeneratedValue(generator = "seq")
    private long id;
    private String description;
    private boolean stat;
    private int priority;
    @ManyToOne
    private TodoList list;

    public long getList() {
        return list.getId();
    }
}
