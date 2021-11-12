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
    List<TodoList> printAllTodoList(){
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
    @PostMapping("/todoList/{idTodoList}")
    TodoList updateTodoList(@PathVariable long idTodoList, @RequestBody TodoList todoList){ return serviceTodo.updateTodoList(idTodoList, todoList); }


    @GetMapping("/todoList/todoItem")
    List<TodoItem> printAllTodoItem(){ return serviceTodo.allTodoItem(); }

    @GetMapping("/todoList/todoItem/{idTodoItem}")
    Optional<TodoItem> printTodoItem(@PathVariable long idTodoItem){ return serviceTodo.todoItem(idTodoItem); }
    @PostMapping("/todoList/{idTodoList}/todoItem")
    Optional<TodoItem> addTodoItem(@PathVariable long idTodoList, @RequestBody TodoItem todoItem){ return serviceTodo.addTodoItem(idTodoList, todoItem); }
    @DeleteMapping("/todoList/todoItem/{idTodoItem}")
    Optional<TodoItem> deleteTodoItem(@PathVariable long idTodoItem){ return serviceTodo.deleteTodoItem(idTodoItem); }

    @GetMapping("/todoList/{idTodoList}/todoItem")
    List<TodoItem> printTodoItemOfList(@PathVariable long idTodoList){ return serviceTodo.allTodoItemOfList(idTodoList); }




}
