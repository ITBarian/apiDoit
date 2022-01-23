package cat.itb.doit.apirest.model.repositoris;

import cat.itb.doit.apirest.model.entities.TodoItem;
import cat.itb.doit.apirest.model.entities.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepoTodoList extends JpaRepository<TodoList, Long> {

    @Query(value = "SELECT * FROM TODO_LIST u WHERE u.ID = ?1", nativeQuery = true)
    List<TodoItem> findExactList(long idTodoList);

}
