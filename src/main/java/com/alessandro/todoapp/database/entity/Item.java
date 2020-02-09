package com.alessandro.todoapp.database.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @author Alessandro Arosio - 09/02/2020 10:23
 */
@Entity
@Table(name = "TODO_ITEM")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Item {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "todo_item_id")
    private Long id;

    @Column(nullable = false)
    private String item;

    @Column(nullable = false)
    private boolean complete;

    @ManyToOne
    @JoinColumn(name = "todo_list_id", insertable = false, updatable = false)
    private TodoList todoList;
}
