package cat.itb.doit.apirest.model.services;
import cat.itb.doit.apirest.model.entities.TodoList;
import cat.itb.doit.apirest.model.repositoris.RepoTodoList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceLists {
    private final RepoTodoList repoTodoList;
    public List<TodoList> allLists(){
        return repoTodoList.findAll();
    }

    public TodoList list(long id) {
        return repoTodoList.getById(id);
    }

    public TodoList addLists(TodoList list) {
        return repoTodoList.save(list);
    }

    public TodoList deleteLists(long id) {
        TodoList l = repoTodoList.getById(id);
        repoTodoList.deleteById(id);
        return l;
    }
}
