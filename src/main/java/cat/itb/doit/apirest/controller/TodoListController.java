package cat.itb.doit.apirest.controller;

import cat.itb.doit.apirest.model.entities.TodoItem;
import cat.itb.doit.apirest.model.entities.TodoList;
import cat.itb.doit.apirest.model.services.ServiceTodo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.persistence.PostUpdate;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TodoListController {

    private final ServiceTodo serviceTodo;

    //TodoList Basic Controllers
    @GetMapping("/todoList") @CrossOrigin(origins="*")
    List<TodoList> printAllTodoList(){ return serviceTodo.allTodoList(); }

    //TodoList CRUD
    @GetMapping("/todoList/{idTodoList}") @CrossOrigin(origins="*")
    Optional<TodoList> printTodoList(@PathVariable long idTodoList){ //Optional<TodoList>
        return serviceTodo.todoList(idTodoList);
    }
    @PostMapping("/todoList") @CrossOrigin(origins="*")
    TodoList addTodoList(@RequestBody TodoList todoList){ return serviceTodo.addTodoList(todoList); }
    @DeleteMapping("/todoList/{idTodoList}") @CrossOrigin(origins="*")
    Optional<TodoList> deleteTodoList(@PathVariable long idTodoList){ return serviceTodo.deleteTodoLists(idTodoList); }
    @PostMapping("/todoList/{idTodoList}") @CrossOrigin(origins="*")
    TodoList updateTodoList(@PathVariable long idTodoList, @RequestBody TodoList todoList){ return serviceTodo.updateTodoList(idTodoList, todoList); }

    //Principal Controller
    @GetMapping("/todoList/{idTodoList}/todoItem") @CrossOrigin(origins="*")
    List<TodoItem> printTodoItemOfList(@PathVariable long idTodoList){ return serviceTodo.allTodoItemOfList(idTodoList); }

    //TodoItem Basic Controllers
    @GetMapping("/todoList/todoItem") @CrossOrigin(origins="*")
    List<TodoItem> printAllTodoItem(){ return serviceTodo.allTodoItem(); }
    //TodoItem CRUD
    @GetMapping("/todoList/todoItem/{idTodoItem}") @CrossOrigin(origins="*")
    Optional<TodoItem> printTodoItem(@PathVariable long idTodoItem){ return serviceTodo.todoItem(idTodoItem); }
    @PostMapping("/todoList/{idTodoList}/todoItem") @CrossOrigin(origins="*")
    Optional<TodoItem> addTodoItem(@PathVariable long idTodoList, @RequestBody TodoItem todoItem){ return serviceTodo.addTodoItem(idTodoList, todoItem); }
    @DeleteMapping("/todoList/todoItem/{idTodoItem}") @CrossOrigin(origins="*")
    Optional<TodoItem> deleteTodoItem(@PathVariable long idTodoItem){ return serviceTodo.deleteTodoItem(idTodoItem); }
    @PostMapping("/todoList/todoItem/{idTodoItem}") @CrossOrigin(origins="*")
    TodoItem updateTodoItem(@PathVariable long idTodoItem, @RequestBody TodoItem todoItem){ return serviceTodo.updateTodoItem(idTodoItem, todoItem); }


}
