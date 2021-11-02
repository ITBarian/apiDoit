package cat.itb.doit.apirest.model.repositoris;

import cat.itb.doit.apirest.model.entities.Lists;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoLists extends JpaRepository<Lists, Long> {
}
