package org.gs.Blog.Entity.Blog;

import org.gs.Blog.Entity.Comment.Comment;
import org.gs.Blog.Entity.Post.Post;

import java.util.List;

public class Blog {
    private List<Comment> comments;
    private Post post;

    public Blog(List<Comment> comments, Post post) {
        this.comments = comments;
        this.post = post;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
