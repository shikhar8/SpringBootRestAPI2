package org.gs.Blog.Entity.Comment;
import javax.persistence.*;
@Entity
@Table(name = "comments")
public class Comment{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  int id;
    @Column(name="post_id")
    private int postId;
    @Column(name = "body")
    private String body;

    public Comment(int postId, String body) {
        this.postId = postId;
        this.body = body;
    }

    public Comment(int id, int postId, String body) {
        this.id = id;
        this.postId = postId;
        this.body = body;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
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
