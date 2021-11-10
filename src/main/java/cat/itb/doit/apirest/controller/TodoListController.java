package cat.itb.doit.apirest.controller;

import cat.itb.doit.apirest.model.entities.TodoItem;
import cat.itb.doit.apirest.model.entities.TodoList;
import cat.itb.doit.apirest.model.services.ServiceTodo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    public TodoList createTodoList(@RequestBody TodoList todoList){
        return serviceTodo.addTodoList(todoList);
    }

    @DeleteMapping("/todoList/{idTodoList}")
    Optional<TodoList> deteleteTodoList(@PathVariable long idTodoList){return serviceTodo.deleteTodoLists(idTodoList);}

    @PostMapping("/todoList/{idTodoList}/todoItem")
    public Optional<TodoItem> createTodoList(@PathVariable long idTodoList, @RequestBody TodoItem todoItem){
        return serviceTodo.addTodoItem(idTodoList, todoItem);
    }

    @GetMapping("/todoList/todoItem/{idTodoItem}")
    Optional<TodoItem> printTodoItem(@PathVariable long idTodoItem){ return serviceTodo.todoItem(idTodoItem);}

    @GetMapping("/todoList/todoItem")
    List<TodoItem> printTodoItem(){ return serviceTodo.allTodoItem();
    }
    @GetMapping("/todoList/{idTodoList}/todoItem")
    List<TodoItem> printTodoItemOfList(@PathVariable long idTodoList){ return serviceTodo.allTodoItemOfList(idTodoList);
    }


//    @GetMapping("/todoList")
//    List<TodoList> printTodoLists(){
//        return serviceTodoList.allTodoLists();
//    }

}
