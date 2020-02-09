package com.alessandro.todoapp.services;

import com.alessandro.todoapp.dto.TodoListDto;

import java.util.List;

/**
 * @author Alessandro Arosio - 09/02/2020 10:47
 */
public interface TodoService {
    List<TodoListDto> getTodoListDto();
}
