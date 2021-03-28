package us.shestakov.petcrud.dao;

import us.shestakov.petcrud.model.Book;

import java.util.List;

public interface BookDAO {
    public void addBook(Book book);
    public void updateBook(int id, Book book);
    public void removeBook(int id);
    public Book getBookById(int id);
    public List<Book> listBook();

}
