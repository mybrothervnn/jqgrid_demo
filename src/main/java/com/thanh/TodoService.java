package com.thanh;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
@Service
public class TodoService {
	@Autowired
	TodoRespository todoRespository;
	
	@Autowired
	TodoValidator todoValidator;
	
	public List<Todo> findAll(Integer limit){
		return Optional.ofNullable(limit)
					.map(value->todoRespository.findAll(PageRequest.of(0,value)).getContent())
					.orElseGet(()->todoRespository.findAll());
	}
	
	public Todo save(Todo todo) {
		if(todoValidator.isValid(todo))
			return todoRespository.save(todo);
		
		return null;
	}

}
