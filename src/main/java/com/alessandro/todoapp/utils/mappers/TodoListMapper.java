package com.alessandro.todoapp.utils.mappers;

import com.alessandro.todoapp.database.entity.TodoList;
import com.alessandro.todoapp.dto.TodoListDto;
import org.mapstruct.Mapper;

/**
 * @author Alessandro Arosio - 09/02/2020 13:54
 */
@Mapper
public interface TodoListMapper {

    TodoListDto todoListToDto(TodoList todoList);

    TodoList dtoToTodoList(TodoListDto dto);
}
