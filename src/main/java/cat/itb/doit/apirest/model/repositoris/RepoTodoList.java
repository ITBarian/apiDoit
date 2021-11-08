package cat.itb.doit.apirest.model.repositoris;

import cat.itb.doit.apirest.model.entities.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoTodoList extends JpaRepository<TodoList, Long> {
}
