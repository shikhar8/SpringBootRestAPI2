package org.gs.Blog.Controller.Comments;

import org.gs.Blog.Entity.Comment.Comment;
import org.gs.Blog.Service.Comments.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
public class CommentsController {
    @Autowired
    private CommentsService commentsService;
    @RequestMapping(value = "/comments/{id}",method = RequestMethod.GET)
    public List<Comment> getCommentsById(@PathVariable int id){
        return commentsService.getCommentsById(id);
    }
    @RequestMapping(value = "/comments",method = RequestMethod.POST)
    void addPost(@RequestBody Comment comment){
        commentsService.addComment(comment);
    }
    @RequestMapping(value = "/comments/{id}",method = RequestMethod.PUT)
    void updatePost(@RequestBody Comment comment,@PathVariable int id){
         commentsService.updateComment(comment,id);
    }@RequestMapping(value = "/comments/{id}",method = RequestMethod.DELETE)
    void deletePost(@PathVariable int id){
         commentsService.deleteComment(id);
    }
}