package cat.itb.doit.apirest.controller;

import cat.itb.doit.apirest.model.entities.TodoList;
import cat.itb.doit.apirest.model.services.ServiceLists;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ListsController {

    private final ServiceLists serviceLists;

    @GetMapping("/hola")
    List<TodoList> holaMundo(){
        return serviceLists.allLists();
    }

    @GetMapping("/Lists")
    List<TodoList> printLists(){
        return serviceLists.allLists();
    }

    @GetMapping("/Lists/{id}")
    TodoList printList(@PathVariable long id){
        return serviceLists.list(id);
    }

    @PostMapping("/Lists")
    public TodoList createLists(@RequestBody TodoList list){
        return serviceLists.addLists(list);
    }

    @DeleteMapping("/Lists/{id}")
    TodoList deleteLists(@PathVariable long id){
        return serviceLists.deleteLists(id);
    }

}
