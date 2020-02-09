package com.alessandro.todoapp.services;

import com.alessandro.todoapp.database.repository.ListRepository;
import com.alessandro.todoapp.dto.TodoListDto;
import com.alessandro.todoapp.utils.mappers.TodoListMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alessandro Arosio - 09/02/2020 10:34
 */
@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService {
    private final ListRepository listRepository;
    private final TodoListMapper todoListMapper;

    public List<TodoListDto> getTodoListDto() {
        return listRepository.findAll()
                .stream()
                .map(todoListMapper::todoListToDto)
                .collect(Collectors.toList());
    }
}
