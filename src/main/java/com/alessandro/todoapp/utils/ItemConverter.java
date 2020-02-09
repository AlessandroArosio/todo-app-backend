package com.alessandro.todoapp.utils;

import com.alessandro.todoapp.database.entity.Item;
import com.alessandro.todoapp.dto.ItemDto;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * @author Alessandro Arosio - 09/02/2020 10:35
 */
@Component
public class ItemConverter implements Converter<Item, ItemDto> {

    @Override
    public ItemDto convert(Item item) {
        return new ItemDto(item.getItem(), item.isComplete());
    }
}
