package cn.ksling.examination.entity;

import java.util.Date;

public class News {
    private Integer id;

    private String title;

    private String newsDesc;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getNewsDesc() {
        return newsDesc;
    }

    public void setNewsDesc(String newsDesc) {
        this.newsDesc = newsDesc == null ? null : newsDesc.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}