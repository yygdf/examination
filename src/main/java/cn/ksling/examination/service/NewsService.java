package cn.ksling.examination.service;

import cn.ksling.examination.entity.News;

import java.util.List;

public interface NewsService {
    // 查询新闻
    List<News> queryNews();
}
