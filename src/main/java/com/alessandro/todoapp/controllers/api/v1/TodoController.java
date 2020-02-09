package com.alessandro.todoapp.controllers.api.v1;

import com.alessandro.todoapp.dto.TodoListDto;
import com.alessandro.todoapp.services.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Alessandro Arosio - 09/02/2020 10:45
 */
@RestController
@RequestMapping("/api/v1/todo")
@RequiredArgsConstructor
public class TodoController {
    private final TodoService todoService;

    @GetMapping("/lists")
    public List<TodoListDto> getTodoLists() {
        return todoService.getTodoListDto();
    }
}
