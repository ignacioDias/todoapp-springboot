package com.app.todoapp.repository;

import com.app.todoapp.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;
//Repository: class que conecta tu app a la db, permitiendo ver, crear y actualizar datos
public interface TaskRepository extends JpaRepository<Task, Long> {

}
