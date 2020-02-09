package com.alessandro.todoapp.database.repository;

import com.alessandro.todoapp.database.entity.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alessandro Arosio - 09/02/2020 10:28
 */
public interface ListRepository extends JpaRepository<TodoList, Long> {
}
