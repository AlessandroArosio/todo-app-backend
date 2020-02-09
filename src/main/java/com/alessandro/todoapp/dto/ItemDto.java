package com.alessandro.todoapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Alessandro Arosio - 09/02/2020 10:37
 */
@Data
@AllArgsConstructor
public class ItemDto {
    private String value;
    private boolean complete;
}
