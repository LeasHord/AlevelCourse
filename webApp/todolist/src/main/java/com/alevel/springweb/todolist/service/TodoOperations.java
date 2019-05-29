package com.alevel.springweb.todolist.service;

import com.alevel.springweb.todolist.persistence.Todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface TodoOperations {

    List<Todo> findAll();

    List<Todo> findAll(boolean done);

    Optional<Todo> find(Long id);


    void update(Long id, Todo todo);

    Long save(Todo todo);

    void delete (Long id);

}
