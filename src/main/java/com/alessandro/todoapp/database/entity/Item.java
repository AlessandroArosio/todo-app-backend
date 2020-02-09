package com.alessandro.todoapp.database.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author Alessandro Arosio - 09/02/2020 10:23
 */
@Entity
@Table(name = "TODO_ITEM")
@Data
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
