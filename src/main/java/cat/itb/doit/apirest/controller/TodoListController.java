package cat.itb.doit.apirest.controller;

import cat.itb.doit.apirest.model.entities.TodoItem;
import cat.itb.doit.apirest.model.entities.TodoList;
import cat.itb.doit.apirest.model.services.ServiceTodoList;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class TodoListController {

    private final ServiceTodoList serviceTodoList;

    @GetMapping("/todoList")
    List<TodoList> printTodoLists(){
        return serviceTodoList.allTodoLists();
    }

    @GetMapping("/todoList/{idTodoList}")
     Optional<TodoList> printTodoList(@PathVariable long idTodoList){ //Optional<TodoList>
        return serviceTodoList.todoList(idTodoList);
    }

    @PostMapping("/todoList")
    public TodoList createTodoList(@RequestBody TodoList todoList){
        return serviceTodoList.addTodoList(todoList);
    }

    @DeleteMapping("/todoList/{idTodoList}")
    Optional<TodoList> deteleteTodoList(@PathVariable long idTodoList){return serviceTodoList.deleteTodoLists(idTodoList);}

    @PostMapping("/todoList/{idTodoList}/todoItems")
    public Optional<TodoItem> createTodoList(@PathVariable long idTodoList, @RequestBody TodoItem todoItem){
        return serviceTodoList.addTodoItem(idTodoList, todoItem);
    }

//    @GetMapping("/todoList")
//    List<TodoList> printTodoLists(){
//        return serviceTodoList.allTodoLists();
//    }

}
