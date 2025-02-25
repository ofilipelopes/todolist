package br.com.filipe.todolist.task;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;
import java.util.List;


public interface ITaskRepository extends JpaRepository<TaskModel, UUID>{
    List<TaskModel> findByidUser(UUID idUser);
}
