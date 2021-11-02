package cat.itb.doit.apirest.model.entities;

import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data @Entity
public class Lists {
    @Id @GeneratedValue
    private long id;
    @OneToMany(mappedBy = "id", fetch = FetchType.LAZY)
    private List<Tasks> taskList = new ArrayList<>();
    private String name;
}
