package com.alevel.springweb.todolist.service;

import com.alevel.springweb.todolist.controller.TodoNotFoundException;
import com.alevel.springweb.todolist.persistence.Todo;
import com.alevel.springweb.todolist.persistence.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public final class TodoService implements TodoOperations {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public List<Todo> findAll() {
        return todoRepository.findAll();
    }

    @Override
    public List<Todo> findAll(boolean done) {
        return todoRepository.findAllByStatus(done);
    }


    @Override
    public Optional<Todo> find(Long id) {
        return todoRepository.findById(id);
    }

    @Override
    public void update(Long id, Todo todo) {

        // if(!find(id).isPresent){
       // throw new TodoNotFoundException(id)}


        Todo old = find(id).orElseThrow(() -> new TodoNotFoundException(id));
        todo.setId(id);
        String text = todo.getText();
        if(todo.getText()!=null){
            old.setText(text);
        }
        if(old.isStatus()!=todo.isStatus()){
            old.setStatus(todo.isStatus());
        }

            todoRepository.save(old);
    }
    @Override
    public Long save(Todo todo) {
        return todoRepository.save(todo).getId();
    }

    @Override
    public void delete(Long id) {
        todoRepository.deleteById(id);
    }
}
