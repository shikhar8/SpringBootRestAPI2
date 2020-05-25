package org.gs.Blog.Controller.Blogs;

import org.gs.Blog.Entity.Blog.Blog;
import org.gs.Blog.Entity.Comment.Comment;
import org.gs.Blog.Repository.Comment.CommentsRepository;
import org.gs.Blog.Repository.Post.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/blogs")
public class BlogController {
    @Autowired
    private PostsRepository postsRepository;
    @Autowired
    private CommentsRepository commentsRepository;
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Blog getBlogById(@PathVariable int id)
    {
        Blog blog=new Blog(commentsRepository.findBypostId(id),postsRepository.findById(id).get());
        return blog;
    }
    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    public void deleteBlogByid(@PathVariable int id)
    {
        postsRepository.deleteById(id);
        List<Comment> comments=commentsRepository.findBypostId(id);
        for(Comment comment:comments)
        {
            commentsRepository.delete(comment);
        }
    }
}
