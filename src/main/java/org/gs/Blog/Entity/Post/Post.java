package org.gs.Blog.Entity.Post;
import javax.persistence.*;

@Entity
@Table(name = "posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;
    @Column(name = "title")
    private  String title;
    @Column(name = "body")
    private String body;

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Post(int id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public Post() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
