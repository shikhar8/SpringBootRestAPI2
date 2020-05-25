package org.gs.Blog.Service.Posts;
import org.gs.Blog.Entity.Post.Post;
import org.gs.Blog.Repository.Post.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class PostsService {
    @Autowired
    private PostsRepository postsRepository;
    public List<Post> getPosts() {
        List<Post> posts=new ArrayList<>();
        for(Post post:postsRepository.findAll())
        {
            posts.add(post);
        }
        if(posts.isEmpty())
        {
            posts.add(new Post());
        }
        return posts;
    }

    public Post getPostsById(int id) {
        return postsRepository.findById(id).get();
    }

    public void addPost(Post post) {
        postsRepository.save(post);
    }

    public void updatePost(Post post, int id) {
        postsRepository.save(post);
    }
    public void deletePost(int id) {
        Post post=postsRepository.findById(id).get();
        if(post!=null)
            postsRepository.delete(post);
    }
}
