package org.gs.Blog.Repository.Posts;

import org.gs.Blog.Entity.Post.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends CrudRepository<Post,Integer> {
}
