package cat.itb.doit.apirest.model.services;
import cat.itb.doit.apirest.model.entities.TodoItem;
import cat.itb.doit.apirest.model.entities.TodoList;
import cat.itb.doit.apirest.model.repositoris.RepoTodoItem;
import cat.itb.doit.apirest.model.repositoris.RepoTodoList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceTodoList {
    private final RepoTodoList repoTodoList;
    private final RepoTodoItem repoTodoItem;
    public List<TodoList> allLists(){
        return repoTodoList.findAll();
    }

    //public Optional<TodoList> list(long id) {
    //        System.out.println(repoTodoList.findById(id));
    //        return repoTodoList.findById(id);
    //    }
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

    public TodoItem addItem(long id, TodoItem item) {

        return repoTodoItem.save(item);

    }
}
