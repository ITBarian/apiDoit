package cat.itb.doit.apirest.model.entities;

import lombok.Data;
import javax.persistence.*;

@Data @Entity
public class TodoList {
    @Id @GeneratedValue
    public long id;
    private String name;

}
