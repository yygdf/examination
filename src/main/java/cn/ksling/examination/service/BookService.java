package cn.ksling.examination.service;

import cn.ksling.examination.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> queryBook();

    Integer addBook(Book book);

    Integer removeBook(Integer id);

    Integer editBook(Book book);
}
