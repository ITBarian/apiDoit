package cat.itb.doit.apirest.model.services;

import cat.itb.doit.apirest.model.entities.Tasks;
import cat.itb.doit.apirest.model.repositoris.RepoTasks;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ServiceTasks {
    private final RepoTasks repoTasks;
    public List<Tasks> allTasks(){
        return repoTasks.findAll();
    }

    public Tasks list(long id) {
        return repoTasks.getById(id);
    }

    public Tasks addTasks(Tasks task) {
        return repoTasks.save(task);
    }

    public Tasks deleteTasks(long id) {
        Tasks l = repoTasks.getById(id);
        repoTasks.deleteById(id);
        return l;
    }
}
