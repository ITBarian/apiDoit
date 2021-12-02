package cat.itb.doit.apirest.model.entities;

import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Data @Entity @SequenceGenerator(name = "seq2", initialValue = 1)
public class TodoList {
    @Id @GeneratedValue(generator = "seq2")
    public long id;
    private String name;
}
