package cat.itb.doit.apirest.model.entities;

import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data @Entity
public class Lists {
    @Id @GeneratedValue
    private long id;
    private String name;
    @OneToMany(mappedBy = "list", fetch = FetchType.LAZY)
    private List<Tasks> taskList = new ArrayList<>();
}
