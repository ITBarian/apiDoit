package cat.itb.doit.apirest.model.services;

import cat.itb.doit.apirest.model.entities.Lists;
import cat.itb.doit.apirest.model.repositoris.RepoLists;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceList {
    private final RepoLists repoLists;
    public List<Lists> allLists(){
        return repoLists.findAll();
    }
}
