package cn.ksling.examination.entity;

import lombok.Data;

@Data
public class BookOrderVo {
    private Book book;
    private BookOrder bookOrder;
    private Integer overdue;
}
