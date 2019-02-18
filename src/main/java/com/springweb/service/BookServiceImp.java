package com.springweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springweb.dao.BookDao;
import com.springweb.dao.BookDaoImp;
import com.springweb.model.Book;

@Service
public class BookServiceImp implements BookService {

	@Autowired
	private BookDao bookDao;

	@Transactional
	public void save(Book book) {
		 bookDao.save(book);
	}

	@Transactional
	public Book get(int id) {
		return bookDao.get(id);
	}

	@Transactional
	public List<Book> list() {
		return bookDao.list();
	}

	@Transactional
	public void update( Book book) {
		bookDao.save(book);;
	}

	@Transactional

	public void delete(int id) {
		bookDao.delete(id);
	}


}
