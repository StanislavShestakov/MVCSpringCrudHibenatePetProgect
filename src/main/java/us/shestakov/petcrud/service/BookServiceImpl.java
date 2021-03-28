package us.shestakov.petcrud.service;

import org.springframework.stereotype.Service;
import us.shestakov.petcrud.dao.BookDAO;
import us.shestakov.petcrud.model.Book;

import javax.transaction.Transactional;
import java.util.List;



@Service
public class BookServiceImpl implements BookService {
    private BookDAO bookDAO;

    @Override
    @Transactional
    public void addBook(Book book) {
        this.bookDAO.addBook(book);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        this.bookDAO.updateBook(book);
    }

    @Override
    @Transactional
    public void removeBook(int id) {
        this.bookDAO.removeBook(id);
    }

    @Override
    @Transactional
    public Book getBookById(int id) {
        return this.getBookById(id);
    }

    @Override
    @Transactional
    public List<Book> listBook() {
        return this.bookDAO.listBook();
    }
}
