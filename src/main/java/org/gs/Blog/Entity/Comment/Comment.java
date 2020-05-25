package org.gs.Blog.Entity.Comment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comments")
public class Comment{
    @Id
    @Column(name = "id")
    private  int id;
    @Column(name = "body")
    private String body;

    public Comment(int id, String body) {
        this.id = id;
        this.body = body;
    }

    public Comment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
