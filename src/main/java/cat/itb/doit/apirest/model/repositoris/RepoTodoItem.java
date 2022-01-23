package cat.itb.doit.apirest.model.repositoris;

import cat.itb.doit.apirest.model.entities.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepoTodoItem extends JpaRepository<TodoItem, Long> {

    @Query(value = "SELECT * FROM TODO_ITEM u WHERE u.LIST_ID = ?1", nativeQuery = true)
    List<TodoItem> findTodoItemOfTodoList(long idTodoList);

    @Query(value = "SELECT * FROM TODO_ITEM", nativeQuery = true)
    List<TodoItem> findAllTodoItem();
}
