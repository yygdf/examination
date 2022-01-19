package cn.ksling.examination.service.impl;

import cn.ksling.examination.entity.News;
import cn.ksling.examination.mapper.NewsMapper;
import cn.ksling.examination.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public List<News> queryNews() {

        return newsMapper.selectNews();
    }
}
