package com.alessandro.todoapp.utils;

import com.alessandro.todoapp.database.entity.Item;
import com.alessandro.todoapp.database.entity.TodoList;
import com.alessandro.todoapp.dto.ItemDto;
import com.alessandro.todoapp.dto.TodoListDto;
import lombok.RequiredArgsConstructor;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Alessandro Arosio - 09/02/2020 10:41
 */
@Deprecated // use TodoListMapper
@Component
@RequiredArgsConstructor
public class TodoListConverter implements Converter<TodoList, TodoListDto> {

    private final ItemConverter itemConverter;

    @Override
    public TodoListDto convert(TodoList todoList) {
        List<Item> items = todoList.getItems();

        List<ItemDto> itemDtos = items.stream()
                .map(itemConverter::convert)
                .collect(Collectors.toList());

        return new TodoListDto(todoList.getName(), itemDtos);
    }
}
