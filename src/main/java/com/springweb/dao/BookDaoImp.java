package com.springweb.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springweb.model.Book;

@Repository
public class BookDaoImp  implements BookDao{

   @Autowired
   private SessionFactory sessionFactory;

   public void save(Book book) {
      sessionFactory.getCurrentSession().save(book);
       book.getId();
   }

   public Book get(int id) {
      return sessionFactory.getCurrentSession().get(Book.class, id);
   }


   public List<Book> list() {
      List<Book> lists = sessionFactory.getCurrentSession().createQuery("FROM Book",Book.class).list();
      return lists;
   }

   public void update( Book book) {
      Session session = sessionFactory.getCurrentSession();
     
   }
   
   public void delete(int id) {
      Book book = sessionFactory.getCurrentSession().byId(Book.class).load(id);
      sessionFactory.getCurrentSession().delete(book);
   }


}
