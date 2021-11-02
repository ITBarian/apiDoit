package cat.itb.doit.apirest.controller;

import cat.itb.doit.apirest.model.entities.Lists;
import cat.itb.doit.apirest.model.services.ServiceLists;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ListsController {

    private final ServiceLists serviceLists;

    @GetMapping("/hola")
    List<Lists> holaMundo(){
        return serviceLists.allLists();
    }

    @GetMapping("/Lists")
    List<Lists> printLists(){
        return serviceLists.allLists();
    }

    @GetMapping("/Lists/{id}")
    Lists printList(@PathVariable long id){
        return serviceLists.list(id);
    }

    @PostMapping("/Lists")
    public Lists createLists(@RequestBody Lists list){
        return serviceLists.addLists(list);
    }

    @DeleteMapping("/Lists/{id}")
    Lists deleteLists(@PathVariable long id){
        return serviceLists.deleteLists(id);
    }

}
