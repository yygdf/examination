package cn.ksling.examination.service.impl;

import cn.ksling.examination.entity.BookOrder;
import cn.ksling.examination.mapper.BookOrderMapper;
import cn.ksling.examination.service.BookOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookOrderServiceImpl implements BookOrderService {
    @Autowired
    private BookOrderMapper bookOrderMapper;

    @Override
    public Integer addBookOrder(BookOrder bookOrder) {

        return bookOrderMapper.insertSelective(bookOrder);
    }

    @Override
    public List<BookOrder> queryBookOrder(Integer userId) {

        return bookOrderMapper.selectByUserId(userId);
    }

    @Override
    public BookOrder queryBookOrderById(Integer id) {

        return bookOrderMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer editBookOrder(BookOrder bookOrder) {

        return bookOrderMapper.updateByPrimaryKeySelective(bookOrder);
    }

    @Override
    public BookOrder queryBookOrderByNum(Integer num) {

        return bookOrderMapper.selectByNum(num);
    }

    @Override
    public Integer removeBookOrder(Integer id) {

        return bookOrderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public BookOrder queryBookOrderByUserIdAndBookId(Integer userId, Integer bookId) {

        return bookOrderMapper.selectByBookOrderByUserIdAndBookId(userId, bookId);
    }

    @Override
    public Integer editBookOrderByPayCode(String payCode) {

        return bookOrderMapper.updateBookOrderByPayCode(payCode);
    }
}
