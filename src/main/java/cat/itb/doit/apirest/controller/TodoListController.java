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

    @GetMapping("/hola")
    List<TodoList> holaMundo(){
        return serviceTodoList.allLists();
    }

    @GetMapping("/Lists")
    List<TodoList> printLists(){
        return serviceTodoList.allLists();
    }

    @GetMapping("/Lists/{id}")
     TodoList printList(@PathVariable long id){ //Optional<TodoList>
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

//    @PostMapping("/Lists/{id}")
//    public TodoItem createLists(@PathVariable long id, @RequestBody TodoItem item){
//        return serviceTodoList.addItem(id, item);
//    }

}
