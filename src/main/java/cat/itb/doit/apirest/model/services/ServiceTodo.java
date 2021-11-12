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
public class ServiceTodo {
    private final RepoTodoList repoTodoList;
    private final RepoTodoItem repoTodoItem;

    public List<TodoList> allTodoList(){
        return repoTodoList.findAll();
    }

    public Optional<TodoList> todoList(long idTodoList) {
            return repoTodoList.findById(idTodoList);
       }
    public TodoList addTodoList(TodoList todoList) {
        return repoTodoList.save(todoList);
    }
    public Optional<TodoList> deleteTodoLists(long idTodoList) {
        Optional<TodoList> todoList = repoTodoList.findById(idTodoList);
        repoTodoItem.deleteAll(allTodoItemOfList(idTodoList));
        repoTodoList.deleteById(idTodoList);
        return todoList;
    }


    public Optional<TodoItem> addTodoItem(long idTodoList, TodoItem todoItem) { return repoTodoList.findById(idTodoList).map(todoList->{todoItem.setList(todoList); return repoTodoItem.save(todoItem);}); }
    public List<TodoItem> allTodoItemOfList(long idTodoList) { return repoTodoItem.findTodoItemOfTodoList(idTodoList); }


    public List<TodoItem> allTodoItem() { return repoTodoItem.findAll(); }

    public Optional<TodoItem> todoItem(long idTodoItem) { return  repoTodoItem.findById(idTodoItem); }
    public Optional<TodoItem> deleteTodoItem(long idTodoItem) {
        Optional<TodoItem> todoItem = repoTodoItem.findById(idTodoItem);
        repoTodoItem.deleteById(idTodoItem);
        return todoItem;
    }


    public TodoList updateTodoList(long idTodoList, TodoList todoList) {
        //TODO
        return todoList;
    }
}
