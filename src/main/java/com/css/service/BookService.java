package com.css.service;

import java.util.List;

import org.hibernate.service.spi.ServiceException;

import com.css.model.Book;

/**
 * @author cvs
 * @create Feb 25, 2015
 */
public interface BookService {

    /**
     * @param book
     *            book
     * @throws ServiceException
     */
    public void addBook(Book book);

    /**
     * @return lista de obrigacoes
     */
    public List<Book> listAllBooks();
}
