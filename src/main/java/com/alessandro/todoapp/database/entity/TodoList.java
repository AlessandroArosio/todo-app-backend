package com.alessandro.todoapp.database.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Alessandro Arosio - 09/02/2020 10:23
 */
@Entity
@Table(name = "TODO_LIST")
@Data
public class TodoList {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "todo_list_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "todo_list_id")
    private List<Item> items = new ArrayList<>();

    public void addTodoItem(Item item) {
        this.items.add(item);
    }

    public void deleteTodoItem(Item item) {
        this.items.remove(item);
    }
}
