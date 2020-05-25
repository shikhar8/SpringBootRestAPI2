package org.gs.Blog.Controller.Posts;

import javafx.geometry.Pos;
import org.gs.Blog.Entity.Post.Post;
import org.gs.Blog.Service.PostsService.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostsController {
    @Autowired
    private PostsService postsService;
    @RequestMapping(name = "/posts",method = RequestMethod.GET)
    public List<Post> getPosts(){
        return postsService.getPosts();
    }
    @RequestMapping(name = "/posts/{id}",method = RequestMethod.GET)
    public List<Post> getPostsById(@PathVariable int id){
        return postsService.getPostsById(id);
    }
    @RequestMapping(name = "/posts",method = RequestMethod.POST)
    void addPost(@RequestBody Post post){
         postsService.addPost(post);
    }
    @RequestMapping(name = "/posts/{id}",method = RequestMethod.PUT)
    void updatePost(@RequestBody Post post,@PathVariable int id){
         postsService.updatePost(post,id);
    }@RequestMapping(name = "/posts/{id}",method = RequestMethod.DELETE)
    void deletePost(@PathVariable int id){
         postsService.deletePost(id);
    }
}
