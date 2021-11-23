package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.Bookrepository;
import com.example.demo.model.Book;

@RestController
@RequestMapping("/book")
public class Usercontroller {
	
	@Autowired
	private Bookrepository bookrepo;
	
	@PostMapping
	public Book savebook(@RequestBody Book book) {
		return bookrepo.save(book);
	}
	
	@GetMapping
	public List<Book> findbooks(){
		return bookrepo.findAll();
	}
}
