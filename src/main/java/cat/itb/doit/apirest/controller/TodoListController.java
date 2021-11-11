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

    @GetMapping("/todoList")
    List<TodoList> printTodoList(){
        return serviceTodo.allTodoList();
    }

    @GetMapping("/todoList/{idTodoList}")
    Optional<TodoList> printTodoList(@PathVariable long idTodoList){ //Optional<TodoList>
        return serviceTodo.todoList(idTodoList);
    }
    @PostMapping("/todoList")
    TodoList addTodoList(@RequestBody TodoList todoList){ return serviceTodo.addTodoList(todoList); }
    @DeleteMapping("/todoList/{idTodoList}")
    Optional<TodoList> deleteTodoList(@PathVariable long idTodoList){ return serviceTodo.deleteTodoLists(idTodoList); }


    @GetMapping("/todoList/todoItem")
    List<TodoItem> printTodoItem(){ return serviceTodo.allTodoItem(); }
    @GetMapping("/todoList/todoItem/{idTodoItem}")
    Optional<TodoItem> printTodoItem(@PathVariable long idTodoItem){ return serviceTodo.todoItem(idTodoItem); }
    @DeleteMapping("/todoList/todoItem/{idTodoItem}")
    Optional<TodoItem> deleteTodoItem(@PathVariable long idTodoItem){ return serviceTodo.deleteTodoItem(idTodoItem); }

    @GetMapping("/todoList/{idTodoList}/todoItem")
    List<TodoItem> printTodoItemOfList(@PathVariable long idTodoList){ return serviceTodo.allTodoItemOfList(idTodoList); }

    @PostMapping("/todoList/{idTodoList}/todoItem")
    Optional<TodoItem> createTodoList(@PathVariable long idTodoList, @RequestBody TodoItem todoItem){ return serviceTodo.addTodoItem(idTodoList, todoItem); }


}
