package com.alevel.springweb.todolist.controller;

import com.alevel.springweb.todolist.persistence.Todo;
import com.alevel.springweb.todolist.service.TodoOperations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private final TodoOperations todoOperations;

    public TodoController(TodoOperations todoOperations) {
        this.todoOperations = todoOperations;
    }

    @GetMapping
    public List<Todo> findAll(@RequestParam(value = "is_done", required = false) Boolean done){
        List<Todo> items;
        if(done!=null){
            return todoOperations.findAll(done);
        }else {
            items = todoOperations.findAll();
        }
        return todoOperations.findAll();
    }

    @GetMapping("/{id}")
    public Todo find(@PathVariable("id") Long id, @RequestParam Boolean done){
         Optional<Todo> todo  = todoOperations.find(id);

        return todoOperations.find(id).orElseThrow(()->new TodoNotFoundException(id));

    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Todo save (@RequestBody Todo todo){
        Long id = todoOperations.save(todo);
        todo.setId(id);
        return todo;

    }
    @PatchMapping("/{id}")
    public void update(@PathVariable Long id,@RequestBody Todo todo){
        todoOperations.update(id,todo);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        todoOperations.delete(id);
    }


}
