package cat.itb.doit.apirest.model.repositoris;

import cat.itb.doit.apirest.model.entities.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoTasks extends JpaRepository<Tasks, Long> {
}
