package cn.ksling.examination.entity;

public class Theme {
    private Integer id;

    private String username;

    private String siteTheme;

    private String logoBg;

    private String headerBg;

    private String sidebarBg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getSiteTheme() {
        return siteTheme;
    }

    public void setSiteTheme(String siteTheme) {
        this.siteTheme = siteTheme == null ? null : siteTheme.trim();
    }

    public String getLogoBg() {
        return logoBg;
    }

    public void setLogoBg(String logoBg) {
        this.logoBg = logoBg == null ? null : logoBg.trim();
    }

    public String getHeaderBg() {
        return headerBg;
    }

    public void setHeaderBg(String headerBg) {
        this.headerBg = headerBg == null ? null : headerBg.trim();
    }

    public String getSidebarBg() {
        return sidebarBg;
    }

    public void setSidebarBg(String sidebarBg) {
        this.sidebarBg = sidebarBg == null ? null : sidebarBg.trim();
    }
}