package cat.itb.doit.apirest.model.services;
import cat.itb.doit.apirest.model.entities.TodoItem;
import cat.itb.doit.apirest.model.entities.TodoList;
import cat.itb.doit.apirest.model.repositoris.RepoTodoItem;
import cat.itb.doit.apirest.model.repositoris.RepoTodoList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ServiceTodoList {
    private final RepoTodoList repoTodoList;
    private final RepoTodoItem repoTodoItem;
    public List<TodoList> allTodoLists(){
        return repoTodoList.findAll();
    }

    public Optional<TodoList> todoList(long idTodoList) {
            return repoTodoList.findById(idTodoList);
       }

    public TodoList addTodoList(TodoList todoList) {
        return repoTodoList.save(todoList);
    }

    public Optional<TodoList> deleteTodoLists(long id) {
        Optional<TodoList> l = repoTodoList.findById(id);
        repoTodoList.deleteById(id);
        return l;
    }

    public TodoItem addTodoItem(long idTodoList, TodoItem todoItem) {
        return repoTodoItem.save(todoItem);
    }
}
