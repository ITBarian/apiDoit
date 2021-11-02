package cat.itb.doit.apirest.model.services;
import cat.itb.doit.apirest.model.entities.Lists;
import cat.itb.doit.apirest.model.repositoris.RepoLists;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceLists {
    private final RepoLists repoLists;
    public List<Lists> allLists(){
        return repoLists.findAll();
    }

    public Lists list(long id) {
        return repoLists.getById(id);
    }

    public Lists addLists(Lists list) {
        return repoLists.save(list);
    }

    public Lists deleteLists(long id) {
        Lists l = repoLists.getById(id);
        repoLists.deleteById(id);
        return l;
    }
}
