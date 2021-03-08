package kea.some.model;

import java.util.Date;

public class Post {

    //Attributer
    private String title;
    private String content;
    private Date date;
    private Boolean privacy;

    //Constructor
    public Post(String title, String content, Date date, Boolean privacy){
        this.title = title;
        this.content = content;
        this.date = date;
        this.privacy = privacy;
    }
    //Metoder
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Boolean privacy) {
        this.privacy = privacy;
    }


}
