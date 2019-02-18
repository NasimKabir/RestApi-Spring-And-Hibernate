package com.springweb.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springweb.model.Book;
import com.springweb.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {
	@Autowired
	private BookService bookService;
	
	//list of books are store
	@GetMapping("/book")
	public List<Book>getBookList(){
		return bookService.list();
		
	}
	//single book list
	@GetMapping("/book/{id}")
	public  Book getbooks(@PathVariable int id) {
		Book singlebook=bookService.get(id);
		return singlebook;
	}
	
	// books are added
	@PostMapping("/book")
	public Book AddBook(@RequestBody Book book) {
		book.setId(0);
		 bookService.save(book);
		 return book;
	}
	// books are update
	@PutMapping("/book")
	public Book UpdateBook(@RequestBody Book book) {
		bookService.update( book);
		return book;
	}
	
	//books are deleted
	@DeleteMapping("/book/{id}")
	public String deletebook(@PathVariable int id) {
		Book book=bookService.get(id);
		bookService.delete(id);
		return "Deleted books :"+id;
	}
}