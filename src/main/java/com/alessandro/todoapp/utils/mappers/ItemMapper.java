package com.alessandro.todoapp.utils.mappers;

import com.alessandro.todoapp.database.entity.Item;
import com.alessandro.todoapp.dto.ItemDto;
import org.mapstruct.Mapper;

/**
 * @author Alessandro Arosio - 09/02/2020 13:49
 */
@Mapper
public interface ItemMapper {

    ItemDto itemToDto(Item item);

    Item dtoToItem(ItemDto dto);
}
