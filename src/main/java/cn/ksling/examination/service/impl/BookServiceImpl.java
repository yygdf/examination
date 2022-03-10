package cn.ksling.examination.service.impl;

import cn.ksling.examination.entity.Book;
import cn.ksling.examination.mapper.BookMapper;
import cn.ksling.examination.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> queryBook() {

        return bookMapper.selectBook();
    }
}
