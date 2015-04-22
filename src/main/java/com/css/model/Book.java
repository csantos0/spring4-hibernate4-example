package com.css.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author cvs
 * @create Apr 22, 2015
 */
@Entity
@Table(name = "CVS_BOOKS")
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "book_id")
    @SequenceGenerator(name = "CVS_BOOK_SEQ", sequenceName = "CVS_BOOK_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CVS_BOOK_SEQ")
    private Long id;

    @Column(name = "book_name")
    private String name;

    @Column(name = "author_name")
    private String author;

    @Column(name = "book_isbn")
    private String isbn;

    /**
     * @return the author
     */
    public String getAuthor() {
	return author;
    }

    /**
     * @return the id
     */
    public Long getId() {
	return id;
    }

    /**
     * @return the isbn
     */
    public String getIsbn() {
	return isbn;
    }

    /**
     * @return the name
     */
    public String getName() {
	return name;
    }

    /**
     * @param pAuthor
     *            the author to set
     */
    public void setAuthor(final String pAuthor) {
	author = pAuthor;
    }

    /**
     * @param pId
     *            the id to set
     */
    public void setId(final Long pId) {
	id = pId;
    }

    /**
     * @param pIsbn
     *            the isbn to set
     */
    public void setIsbn(final String pIsbn) {
	isbn = pIsbn;
    }

    /**
     * @param pName
     *            the name to set
     */
    public void setName(final String pName) {
	name = pName;
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
	return "Book [name=" + name + ", author=" + author + "]";
    }

}
