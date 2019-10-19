package com.thanh;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRespository extends JpaRepository<Todo, Long>{
	List<Todo> findAllByTitle(String title);
	List<Todo> findByTitleLikeOrDetailLike(String title,String detail);
}
