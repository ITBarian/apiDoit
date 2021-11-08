package cat.itb.doit.apirest.model.repositoris;

import cat.itb.doit.apirest.model.entities.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepoTodoItem extends JpaRepository<TodoItem, Long> {
}
