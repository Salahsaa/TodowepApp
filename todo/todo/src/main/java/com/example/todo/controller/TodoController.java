package com.example.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.todo.model.Todo;
import com.example.todo.repositories.TodoRepository;

@RestController
@RequestMapping("/todo")
public class TodoController {

	
	@Autowired
	TodoRepository todoRepository;
	
	@GetMapping("findAll")
	public List<Todo> fetchAll(){
		return this.todoRepository.findAll();
	}
}
