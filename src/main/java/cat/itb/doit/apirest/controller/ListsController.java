package cat.itb.doit.apirest.controller;

import cat.itb.doit.apirest.model.entities.Lists;
import cat.itb.doit.apirest.model.services.ServiceList;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ListsController {

    private final ServiceList serviceList;

    @GetMapping("/hola")
    List<Lists> holaMundo(){
        return serviceList.allLists();
    }
}
