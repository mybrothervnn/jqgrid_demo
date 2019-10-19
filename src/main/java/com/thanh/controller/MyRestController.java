package com.thanh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thanh.Todo;
import com.thanh.TodoRespository;
import com.thanh.TodoService;

@RestController
public class MyRestController {
public static final int LIMIT_LIST_TODO = 8;
	
	@Autowired
	TodoRespository todoRespository;
	
	@Autowired
	TodoService todoService;
	
	List<Todo> listTodo;
	
	
	@Bean
	void initList2(){
		listTodo = todoRespository.findAll();	
		
	}
	
	@GetMapping("/getJson")
	public List<Todo> getJson(){
		return listTodo;
	}
}
