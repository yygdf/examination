package cn.ksling.examination.mapper;

import cn.ksling.examination.entity.BookOrder;

import java.util.List;

public interface BookOrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookOrder record);

    int insertSelective(BookOrder record);

    BookOrder selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookOrder record);

    int updateByPrimaryKey(BookOrder record);

    List<BookOrder> selectByUserId(Integer userId);

    BookOrder selectByNum(Integer num);

    BookOrder selectByBookOrderByUserIdAndBookId(Integer userId, Integer bookId);

    Integer updateBookOrderByPayCode(String payCode);
}