package com.alessandro.todoapp.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alessandro Arosio - 09/02/2020 10:38
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TodoListDto {
    private String name;
    private List<ItemDto> items = new ArrayList<>();

    public void addItem(ItemDto item) {
        this.items.add(item);
    }

    public void remoteItem(ItemDto itemDto) {
        this.items.remove(itemDto);
    }
}
