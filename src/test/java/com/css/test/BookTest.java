package com.css.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.css.model.Book;
import com.css.service.BookService;

/**
 * @author cvs
 * @create Apr 22, 2015
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/spring.xml" })
public class BookTest {

    @Inject
    private BookService service;

    /**
     * 
     */
    @Test
    public void testInsertObrigacao() {
	final Book b = new Book();
	b.setName("Learning Spring Application Development");
	b.setAuthor("Ravi Kant Soni");
	b.setIsbn("978-1-78398-737-5");
	this.service.addBook(b);

	final Book b2 = new Book();
	b2.setName("Pragmatic Unit Testing in Java 8 with JUnit");
	b2.setAuthor("Jeff Langr");
	b2.setIsbn("978-1-941222-59-1");
	this.service.addBook(b2);
    }

    /**
     * 
     */
    @Test
    public void testLoadAll() {
	final List<Book> listaResultado = this.service.listAllBooks();
	assertEquals(4, listaResultado.size());
    }

}
