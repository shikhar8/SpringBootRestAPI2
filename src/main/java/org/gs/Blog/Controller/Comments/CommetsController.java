package org.gs.Blog.Controller.Comments;

import javafx.geometry.Pos;
import org.gs.Blog.Entity.Comment.Comment;
import org.gs.Blog.Entity.Post.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentsController {
    @Autowired
    private CommentsService commentsService;
    @RequestMapping(name = "/comments/{id}",method = RequestMethod.GET)
    public List<Comment> getCommentsById(@PathVariable int id){
        return commentsService.getCommentsById(id);
    }
    @RequestMapping(name = "/comments",method = RequestMethod.POST)
    void addPost(@RequestBody Comment comment){
        commentsService.addComment(comment);
    }
    @RequestMapping(name = "/comments/{id}",method = RequestMethod.PUT)
    void updatePost(@RequestBody Comment comment,@PathVariable int id){
         commentsService.updateComment(comment,id);
    }@RequestMapping(name = "/comments/{id}",method = RequestMethod.DELETE)
    void deletePost(@PathVariable int id){
         commentsService.deleteComment(id);
    }
}