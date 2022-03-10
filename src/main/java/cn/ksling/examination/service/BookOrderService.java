package cn.ksling.examination.service;

import cn.ksling.examination.entity.BookOrder;

import java.util.List;

public interface BookOrderService {
    Integer addBookOrder(BookOrder bookOrder);

    List<BookOrder> queryBookOrder(Integer userId);

    BookOrder queryBookOrderById(Integer id);

    Integer editBookOrder(BookOrder bookOrder);

    BookOrder queryBookOrderByNum(Integer num);

    Integer removeBookOrder(Integer id);

    BookOrder queryBookOrderByUserIdAndBookId(Integer userId, Integer bookId);

    Integer editBookOrderByPayCode(String payCode);
}
