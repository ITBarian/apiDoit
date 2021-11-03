package cat.itb.doit.apirest.controller;

import cat.itb.doit.apirest.model.entities.Tasks;
import cat.itb.doit.apirest.model.services.ServiceTasks;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class TasksController {

    private final ServiceTasks serviceTasks;

    @GetMapping("/Tasks")
    List<Tasks> printTasks(){
        return serviceTasks.allTasks();
    }

    @GetMapping("/Tasks/{id}")
    Tasks printList(@PathVariable long id){
        return serviceTasks.list(id);
    }

    @PostMapping("/Tasks")
    public Tasks createTasks(@RequestBody Tasks task){
        return serviceTasks.addTasks(task);
    }

    @DeleteMapping("/Tasks/{id}")
    Tasks deleteTasks(@PathVariable long id){
        return serviceTasks.deleteTasks(id);
    }

}
