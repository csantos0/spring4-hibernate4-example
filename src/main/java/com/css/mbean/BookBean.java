package com.css.mbean;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.css.model.Book;
import com.css.service.BookService;

/**
 * @author cvs
 * @create Apr 22, 2015
 */
@ManagedBean
@SessionScoped
public class BookBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private BookService service;

    private Book book;

    private String name;

    /**
     * @return navigation
     */
    public String addBook() {
	try {
	    this.service.addBook(this.book);
	    this.book = new Book();
	    return "success";
	} catch (final Exception ex) {
	    ex.printStackTrace();
	    return "fail";
	}

    }

    /**
     * @return the book
     */
    public Book getBook() {
	return book;
    }

    /**
     * @return lista
     */
    public DataModel<Book> getBooksList() {
	final List<Book> list = this.service.listAllBooks();
	return new ListDataModel<Book>(list);
    }

    /**
     * @return name
     */
    public String getName() {
	return name;
    }

    /**
     * 
     */
    @SuppressWarnings("resource")
    @PostConstruct
    public void init() {
	final ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	this.service = context.getBean(BookService.class);
	this.book = new Book();
    }

    /**
     * @param pBook
     *            the book to set
     */
    public void setBook(final Book pBook) {
	book = pBook;
    }

    /**
     * @param name
     */
    @SuppressWarnings("hiding")
    public void setName(final String name) {
	this.name = name;
    }
}