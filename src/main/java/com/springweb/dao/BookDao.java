package com.springweb.dao;

import java.util.List;

import com.springweb.model.Book;

public interface BookDao {
	public void save(Book book);

	public Book get(int id);

	public List<Book> list();

	public void update( Book book);

	public void delete(int id);
}
