package cat.itb.doit.apirest.controller;

import cat.itb.doit.apirest.model.entities.TodoList;
import cat.itb.doit.apirest.model.services.ServiceTodoList;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TodoListController {

    private final ServiceTodoList serviceTodoList;

    @GetMapping("/hola")
    List<TodoList> holaMundo(){
        return serviceTodoList.allLists();
    }

    @GetMapping("/Lists")
    List<TodoList> printLists(){
        return serviceTodoList.allLists();
    }

    @GetMapping("/Lists/{id}")
    TodoList printList(@PathVariable long id){
        return serviceTodoList.list(id);
    }

    @PostMapping("/Lists")
    public TodoList createLists(@RequestBody TodoList list){
        return serviceTodoList.addLists(list);
    }

    @DeleteMapping("/Lists/{id}")
    TodoList deleteLists(@PathVariable long id){
        return serviceTodoList.deleteLists(id);
    }

}
