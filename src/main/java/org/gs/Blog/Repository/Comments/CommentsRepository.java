package org.gs.Blog.Repository.Comments;

import org.gs.Blog.Entity.Comment.Comment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsRepository extends CrudRepository<Comment,Integer> {
    List<Comment> findBypostId(int id);
}
