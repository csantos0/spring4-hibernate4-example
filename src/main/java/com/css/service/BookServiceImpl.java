package com.css.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.css.dao.GenericDao;
import com.css.model.Book;

/**
 * @author cvs
 * @create Feb 25, 2015
 */
@Service("bookService")
public class BookServiceImpl implements BookService {

    @Inject
    private GenericDao<Book, Long> genericDao;

    /*
     * (non-Javadoc)
     * @see com.css.service.BookService#addBook(com.css.model.Book)
     */
    @Override
    public void addBook(final Book pBook) {
	this.genericDao.persist(pBook);

    }

    /*
     * (non-Javadoc)
     * @see com.css.service.BookService#listAllBooks()
     */
    @Override
    public List<Book> listAllBooks() {
	return this.genericDao.loadAll(Book.class);
    }

}
