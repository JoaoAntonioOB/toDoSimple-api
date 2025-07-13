package com.joaoBarroso.todosimple.repositories;

import com.joaoBarroso.todosimple.models.Task;
import com.joaoBarroso.todosimple.models.projection.TaskProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    List<TaskProjection> findByUser_Id(Long id);

}
