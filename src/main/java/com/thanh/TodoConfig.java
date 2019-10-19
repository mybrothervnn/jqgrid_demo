package com.thanh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoConfig {
	@Bean
	public TodoValidator getTodoValidator() {
		return new TodoValidator();
	}
}
